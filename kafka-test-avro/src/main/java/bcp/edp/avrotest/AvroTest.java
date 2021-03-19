package bcp.edp.avrotest;



import java.time.Duration;
import java.util.*;


import EdpSimulator.Entities.AuditRecord;
import EdpSimulator.Entities.Cards;
import EdpSimulator.Entities.Category;
import EdpSimulator.Entities.H2h;
import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;


import key.SOURCEDB.CAM00020.CAM20.LOGTXN_T;
import key.SOURCEDB.DEP000PA.DEPPA.HMV_DDA;
import key.SOURCEDB.HTH000PA.HTHPA.HTHPSE_T;
import lombok.NonNull;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.config.TopicConfig;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.*;
import org.apache.kafka.streams.kstream.*;


public class AvroTest {

    public Topology createTopology(@NonNull Properties properties) {

        try {
            final String DDA_TOPIC = properties.getProperty("topic.transaction.dda");
            final String H2H_TOPIC = properties.getProperty("topic.transaction.h2h");
            final String CARDS_TOPIC = properties.getProperty("topic.transaction.cards");
            final String CATEGORY_TOPIC = properties.getProperty("topic.transaction.category");

            final StreamsBuilder builder = new StreamsBuilder();

            final String SCHEMA_REGISTRY_URL = properties.getProperty("schema.registry.url");
            final String AVRO_OR_JSON = properties.getProperty("avro.or.json");
            final String GENERIC_OR_SPECIFIC_AVRO = properties.getProperty("generic.or.specific.avro");

            if (AVRO_OR_JSON.equals("avro")) {
                final Serde<HTHPSE_T> h2hKeySerde = new SpecificAvroSerde<>();
                final Serde<H2h> h2hValueSerde = new SpecificAvroSerde<>();
                final Serde<HMV_DDA> ddaKeySerde = new SpecificAvroSerde<>();
                final Serde<AuditRecord> ddaValueSerde = new SpecificAvroSerde<>();
                final Serde<LOGTXN_T> cardsKeySerde = new SpecificAvroSerde<>();
                final Serde<Cards> cardsValueSerde = new SpecificAvroSerde<>();
                final Serde<Category> categoryValueSerde = new SpecificAvroSerde<>();

                configureSerde(ddaKeySerde, SCHEMA_REGISTRY_URL);
                configureSerde(ddaValueSerde, SCHEMA_REGISTRY_URL);
                configureSerde(h2hKeySerde, SCHEMA_REGISTRY_URL);
                configureSerde(h2hValueSerde, SCHEMA_REGISTRY_URL);
                configureSerde(cardsKeySerde, SCHEMA_REGISTRY_URL);
                configureSerde(cardsValueSerde, SCHEMA_REGISTRY_URL);
                configureSerde(categoryValueSerde, SCHEMA_REGISTRY_URL);

                //DDA
                KStream<HMV_DDA, AuditRecord> ddaStream = builder.stream(DDA_TOPIC,
                        Consumed.with(ddaKeySerde, ddaValueSerde));
                //transactionKeyH2H ("H2H_ID" + HDDA_KEY_COMP + "DDA" + HDDA_KEY_CONTA + HDDA_HST_TRACE_ID)
                KStream<String, AuditRecord> ddaStreamRekey = ddaStream.selectKey((key,value) -> String.valueOf("H2H_ID" + value.getAfterImage().getHDDAKEYCOMP() + "DDA" + value.getAfterImage().getHDDAKEYCONTA() + value.getAfterImage().getHDDAHSTTRACEID()));

                //H2H
                KStream<HTHPSE_T, H2h> h2hStream = builder.stream(H2H_TOPIC,
                        Consumed.with(h2hKeySerde, h2hValueSerde));
                //transactionKey ("H2H_ID" + IDMSGBAN_2 + "DDA" + CONTA_CLI + "H003" + IDMSGBAN_1 + IDMSGBAN_2)
                KStream<String, H2h> h2hStreamRekey = h2hStream.selectKey((key,value) -> String.valueOf("H2H_ID" + value.getAfterImage().getIDMSGBAN2() + "DDA" + value.getAfterImage().getCONTACLI()) + "H003" + value.getAfterImage().getIDMSGBAN1() + value.getAfterImage().getIDMSGBAN2());

                //CARDS
                //Transactionkey "CARDS_ID" + HDDA_HST_DESCR_CONT + HDDA_HST_TAMT + HDDA_HST_TRAN_SIGN + HDDA_HST_DATA_SISTEMA + HDDA_HST_HORA
                KStream<String, AuditRecord> ddaCardsStreamRekey = ddaStream.selectKey((key,value) -> String.valueOf("CARDS_ID" + value.getAfterImage().getHDDAHSTDESCRCONT() + value.getAfterImage().getHDDAHSTTAMT() + value.getAfterImage().getHDDAHSTTRANSIGN() + value.getAfterImage().getHDDAHSTDATASISTEMA() + value.getAfterImage().getHDDAHSTHORA()));
                //Transactionkey "CARDS_ID" + ORIG_PLAS + TXN_AMT + TXN_SINAL + TXN_DT + TXN_TM
                KStream<String, Cards> cardsStream = builder.stream(CARDS_TOPIC,
                        Consumed.with(Serdes.String(), cardsValueSerde));
                KStream<String, Cards> cardsStreamRekey = cardsStream.selectKey((key,value) -> String.valueOf("CARDS_ID" + value.getAfterImage().getORIGPLAS() + value.getAfterImage().getTXNAMT() + value.getAfterImage().getTXNSINAL() + value.getAfterImage().getTXNDT() + value.getAfterImage().getTXNTM()));

                //CATEGORY
                KStream<String, Category> categoryStream = builder.stream(CATEGORY_TOPIC,
                        Consumed.with(Serdes.String(), categoryValueSerde));
                KStream<String, Category> categoryStreamRekey = categoryStream.selectKey((key,value) -> String.valueOf(value.getTransactionid()));


                //JOIN DDA-H2H

                KStream<String, AuditRecord> ddaH2hStream = ddaStreamRekey.join(h2hStreamRekey,
                        (leftValue, rightValue) -> AuditRecord.newBuilder(leftValue).setACCID("DDA + H2H").build(), /* ValueJoiner */
                        JoinWindows.of(Duration.ofSeconds(5)),
                        StreamJoined.with(
                                Serdes.String(), /* key */
                                ddaValueSerde,   /* left value */
                                h2hValueSerde)  /* right value */
                );

                //JOIN DDA-CARDS
                KStream<String, AuditRecord> ddaCardsStream = ddaCardsStreamRekey.join(cardsStreamRekey,
                        (leftValue, rightValue) -> AuditRecord.newBuilder(leftValue).setACCID("DDA + CARDS").build(), /* ValueJoiner */
                        JoinWindows.of(Duration.ofSeconds(5)),
                        StreamJoined.with(
                                Serdes.String(), /* key */
                                ddaValueSerde,   /* left value */
                                cardsValueSerde)  /* right value */
                );


                //transactionid HDDA_KEY_COMP + HDDA_KEY_CONTA + HDDA_KEY_DATA_LANCAMENTO + HDDA_KEY_ORIGEM + HDDA_KEY_DATA_HORA
                KStream<String, AuditRecord> ddaH2hReKeyStream = ddaH2hStream.selectKey((key,value) -> String.valueOf(String.valueOf(value.getAfterImage().getHDDAKEYCOMP()) + String.valueOf(value.getAfterImage().getHDDAKEYCONTA()) + String.valueOf(value.getAfterImage().getHDDAKEYDATALANCAMENTO()) + String.valueOf(value.getAfterImage().getHDDAKEYORIGEM()) + value.getAfterImage().getHDDAKEYDATAHORA()));
                KStream<String, AuditRecord> ddaCardsReKeyStream = ddaCardsStream.selectKey((key,value) -> String.valueOf(String.valueOf(value.getAfterImage().getHDDAKEYCOMP()) + String.valueOf(value.getAfterImage().getHDDAKEYCONTA()) + String.valueOf(value.getAfterImage().getHDDAKEYDATALANCAMENTO()) + String.valueOf(value.getAfterImage().getHDDAKEYORIGEM()) + value.getAfterImage().getHDDAKEYDATAHORA()));

                //JOIN DDA-H2H-CARDS
                KStream<String, AuditRecord> ddaH2hCardsStream = ddaH2hReKeyStream.join(ddaCardsReKeyStream,
                        (leftValue, rightValue) -> AuditRecord.newBuilder(leftValue).setACCID("DDA + H2H + CARDS").build(), /* ValueJoiner */
                        JoinWindows.of(Duration.ofSeconds(5)),
                        StreamJoined.with(
                                Serdes.String(), /* key */
                                ddaValueSerde,   /* left value */
                                ddaValueSerde)  /* right value */
                );

                //JOIN DDA-H2H-CARDS
                KStream<String, AuditRecord> ddaH2hCardsCategoryStream = ddaH2hCardsStream.join(categoryStreamRekey,
                        (leftValue, rightValue) -> AuditRecord.newBuilder(leftValue).setACCID("DDA + H2H + CARDS + CATEGORY").build(), /* ValueJoiner */
                        JoinWindows.of(Duration.ofSeconds(5)),
                        StreamJoined.with(
                                Serdes.String(), /* key */
                                ddaValueSerde,   /* left value */
                                categoryValueSerde)  /* right value */
                );



                ddaH2hCardsCategoryStream.print(Printed.toSysOut());

            }


            else {
                //Construir sem avro
            }

            Topology topology = builder.build();

            // Print topology:
             System.out.println("Topology: " + topology.describe());

            return topology;

        } catch (Exception e) {
            throw e;
        }
    }

    private void configureSerde(Serde<?> serde, String schemaRegistryUrl){
        serde.configure(
                Collections.singletonMap(
                        AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, schemaRegistryUrl),
                true);
    }


    public void createTopics(Properties envProps) {
        Map<String, Object> config = new HashMap<>();
        config.put("bootstrap.servers", envProps.getProperty("bootstrap.servers"));
        AdminClient client = AdminClient.create(config);

        List<NewTopic> topics = new ArrayList<>();


        topics.add(new NewTopic(
                "join-topic",
                Integer.parseInt("10"),
                Short.parseShort("1")));

        client.createTopics(topics);
        client.close();
    }

    public static void main(String[] args) {
        try {
            final Properties properties = new Properties();
            properties.load(AvroTest.class.getClassLoader().getResourceAsStream("config.properties"));

            final Properties streamsConfig = new Properties();
            streamsConfig.put(StreamsConfig.APPLICATION_ID_CONFIG, properties.getProperty("application.id"));
            streamsConfig.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, properties.getProperty("bootstrap.servers"));
            streamsConfig.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, properties.getProperty("auto.offset.reset"));
            // streamsConfig.put(StreamsConfig.TOPOLOGY_OPTIMIZATION, StreamsConfig.OPTIMIZE);

            final String SCHEMA_REGISTRY_URL = properties.getProperty("schema.registry.url");
            final String AVRO_OR_JSON = properties.getProperty("avro.or.json");
            final String GENERIC_OR_SPECIFIC_AVRO = properties.getProperty("generic.or.specific.avro");
            final String RESILIENCE_CONFIG = properties.getProperty("resilience.config");

            // Read for Avro:
            // https://docs.confluent.io/platform/current/streams/developer-guide/datatypes.html#avro

            // if (AVRO_OR_JSON.equals("avro") && GENERIC_OR_SPECIFIC_AVRO.equals("generic")) {
            if (AVRO_OR_JSON.equals("avro")) {
                streamsConfig.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, SpecificAvroSerde.class);
                streamsConfig.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, SpecificAvroSerde.class);
                streamsConfig.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, SCHEMA_REGISTRY_URL);
                streamsConfig.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, true);
                streamsConfig.put(StreamsConfig.CACHE_MAX_BYTES_BUFFERING_CONFIG, 0);


                // streamsConfig.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,SpecificAvroSerde.class);

            }
            /* else if (AVRO_OR_JSON.equals("avro") && GENERIC_OR_SPECIFIC_AVRO.equals("specific")) {
                streamsConfig.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, SpecificAvroSerde.class);
                streamsConfig.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, SpecificAvroSerde.class);
                streamsConfig.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, SCHEMA_REGISTRY_URL);
            } */
            else {
                streamsConfig.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
                streamsConfig.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());
            }

            if (RESILIENCE_CONFIG.equals("true")) {
                streamsConfig.put(StreamsConfig.REPLICATION_FACTOR_CONFIG, 1);
                streamsConfig.put(StreamsConfig.topicPrefix(TopicConfig.MIN_IN_SYNC_REPLICAS_CONFIG), 1);
                streamsConfig.put(StreamsConfig.producerPrefix(ProducerConfig.ACKS_CONFIG), "all");
            }

            KafkaStreams streams =
                    new KafkaStreams(new AvroTest().createTopology(properties), streamsConfig);

            streams.start();
            streams.cleanUp();
            Runtime.getRuntime().addShutdownHook(new Thread(streams::close));
            streams.cleanUp();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}