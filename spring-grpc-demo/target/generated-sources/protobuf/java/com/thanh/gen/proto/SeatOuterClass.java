// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: seat.proto

package com.thanh.gen.proto;

public final class SeatOuterClass {
  private SeatOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_thanh_grpc_NumberOfSeats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_thanh_grpc_NumberOfSeats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_thanh_grpc_ReserveSeatResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_thanh_grpc_ReserveSeatResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_thanh_grpc_SeatList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_thanh_grpc_SeatList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_thanh_grpc_Seat_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_thanh_grpc_Seat_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nseat.proto\022\016com.thanh.grpc\"\036\n\rNumberOf" +
      "Seats\022\r\n\005total\030\001 \001(\005\"7\n\023ReserveSeatRespo" +
      "nse\022\017\n\007success\030\001 \001(\010\022\017\n\007message\030\002 \001(\t\"/\n" +
      "\010SeatList\022#\n\005seats\030\001 \003(\0132\024.com.thanh.grp" +
      "c.Seat\"3\n\004Seat\022\013\n\003row\030\001 \001(\005\022\016\n\006column\030\002 " +
      "\001(\005\022\016\n\006status\030\003 \001(\t2\236\001\n\016SeatController\022J" +
      "\n\007Reserve\022\030.com.thanh.grpc.SeatList\032#.co" +
      "m.thanh.grpc.ReserveSeatResponse\"\000\022@\n\003Ge" +
      "t\022\035.com.thanh.grpc.NumberOfSeats\032\030.com.t" +
      "hanh.grpc.SeatList\"\000B\027\n\023com.thanh.gen.pr" +
      "otoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_thanh_grpc_NumberOfSeats_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_thanh_grpc_NumberOfSeats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_thanh_grpc_NumberOfSeats_descriptor,
        new java.lang.String[] { "Total", });
    internal_static_com_thanh_grpc_ReserveSeatResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_thanh_grpc_ReserveSeatResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_thanh_grpc_ReserveSeatResponse_descriptor,
        new java.lang.String[] { "Success", "Message", });
    internal_static_com_thanh_grpc_SeatList_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_thanh_grpc_SeatList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_thanh_grpc_SeatList_descriptor,
        new java.lang.String[] { "Seats", });
    internal_static_com_thanh_grpc_Seat_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_thanh_grpc_Seat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_thanh_grpc_Seat_descriptor,
        new java.lang.String[] { "Row", "Column", "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
