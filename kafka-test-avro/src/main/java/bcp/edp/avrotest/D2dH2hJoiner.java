//package bcp.edp.avrotest;
//
//
//import EdpSimulator.Entities.H2h;
//import org.apache.kafka.streams.kstream.ValueJoiner;
//
//
//public class D2dH2hJoiner implements ValueJoiner<String, H2h, AuditRecord> {
//
//  public AuditRecord  apply(String d2d, H2h h2h) {
//    return AuditRecord.newBuilder()
//            .setACCID("DDA + H2H")
//            .setAENTTYP("JOINED")
//        .build();
//  }
//
//}