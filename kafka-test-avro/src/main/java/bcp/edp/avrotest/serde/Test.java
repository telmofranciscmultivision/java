//package bcp.edp.avrotest.serde;
//
//import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
//import io.confluent.kafka.streams.serdes.avro.GenericAvroSerde;
//import org.apache.avro.generic.GenericRecord;
//import org.apache.kafka.clients.admin.AdminClient;
//import org.apache.kafka.clients.admin.NewTopic;
//import org.apache.kafka.common.serialization.Serde;
//import org.apache.kafka.common.serialization.Serdes;
//import org.apache.kafka.streams.KafkaStreams;
//import org.apache.kafka.streams.StreamsBuilder;
//import org.apache.kafka.streams.StreamsConfig;
//import org.apache.kafka.streams.Topology;
//import org.apache.kafka.streams.kstream.JoinWindows;
//import org.apache.kafka.streams.kstream.Joined;
//import org.apache.kafka.streams.kstream.KStream;
//
//import java.io.IOException;
//import java.time.Duration;
//import java.util.*;
//
//public class Test {
//
//
//
//    public static void main(String[] args) throws IOException {
//        KafkaStreams streamsInnerJoin;
//        Properties props = new Properties();
//        props.load(Test.class.getClassLoader().getResourceAsStream("config.properties"));
//        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "stream-stream-inner-join");
//        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, GenericAvroSerde.class);
//        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, GenericAvroSerde.class);
//       // final String DDA_TOPIC = props.getProperty("topic.transaction.dda");
//        final String H2H_TOPIC = props.getProperty("topic.transaction.h2h");
//        final String SCHEMA_REGISTRY_URL = props.getProperty("schema.registry.url");
//        createTopics(props);
//
//        final Serde<GenericRecord> genericKeySerde = new GenericAvroSerde();
//        final Serde<GenericRecord> genericValueSerde = new GenericAvroSerde();
//        final StreamsBuilder builder = new StreamsBuilder();
//
//        genericKeySerde.configure(
//                Collections.singletonMap(
//                        AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, SCHEMA_REGISTRY_URL),
//                true);
//
//        genericValueSerde.configure(
//                Collections.singletonMap(
//                        AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, SCHEMA_REGISTRY_URL),
//                false);
//
//        KStream<GenericRecord, GenericRecord> leftSource = builder.stream("kafka.streams.dda.topic");
//        KStream<GenericRecord, GenericRecord> rightSource = builder.stream(H2H_TOPIC);
//
//        KStream<GenericRecord, GenericRecord> joined = leftSource.join(rightSource,
//                (leftValue, rightValue) -> leftValue, /* ValueJoiner */
//                JoinWindows.of(Duration.ofMinutes(5)),
//                Joined.with(
//                        genericKeySerde, /* key */
//                        genericValueSerde,   /* left value */
//                        genericValueSerde)  /* right value */
//        );
//
//        joined.to("my.kafka.out");
//
//        final Topology topology = builder.build();
//        streamsInnerJoin = new KafkaStreams(topology, props);
//        streamsInnerJoin.start();
//    }
//
//    public static void createTopics(Properties envProps) {
//        Map<String, Object> config = new HashMap<>();
//        config.put("bootstrap.servers", envProps.getProperty("bootstrap.servers"));
//        AdminClient client = AdminClient.create(config);
//
//        List<NewTopic> topics = new ArrayList<>();
//
//        topics.add(new NewTopic(
//                envProps.getProperty("movie.topic.name"),
//                Integer.parseInt(envProps.getProperty("movie.topic.partitions")),
//                Short.parseShort(envProps.getProperty("movie.topic.replication.factor"))));
//
//        client.createTopics(topics);
//        client.close();
//    }
//}
