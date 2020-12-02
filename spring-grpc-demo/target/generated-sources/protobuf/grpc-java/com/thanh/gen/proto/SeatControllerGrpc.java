package com.thanh.gen.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: seat.proto")
public final class SeatControllerGrpc {

  private SeatControllerGrpc() {}

  public static final String SERVICE_NAME = "com.thanh.grpc.SeatController";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.thanh.gen.proto.SeatList,
      com.thanh.gen.proto.ReserveSeatResponse> getReserveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reserve",
      requestType = com.thanh.gen.proto.SeatList.class,
      responseType = com.thanh.gen.proto.ReserveSeatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thanh.gen.proto.SeatList,
      com.thanh.gen.proto.ReserveSeatResponse> getReserveMethod() {
    io.grpc.MethodDescriptor<com.thanh.gen.proto.SeatList, com.thanh.gen.proto.ReserveSeatResponse> getReserveMethod;
    if ((getReserveMethod = SeatControllerGrpc.getReserveMethod) == null) {
      synchronized (SeatControllerGrpc.class) {
        if ((getReserveMethod = SeatControllerGrpc.getReserveMethod) == null) {
          SeatControllerGrpc.getReserveMethod = getReserveMethod = 
              io.grpc.MethodDescriptor.<com.thanh.gen.proto.SeatList, com.thanh.gen.proto.ReserveSeatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.thanh.grpc.SeatController", "Reserve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thanh.gen.proto.SeatList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thanh.gen.proto.ReserveSeatResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SeatControllerMethodDescriptorSupplier("Reserve"))
                  .build();
          }
        }
     }
     return getReserveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thanh.gen.proto.NumberOfSeats,
      com.thanh.gen.proto.SeatList> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.thanh.gen.proto.NumberOfSeats.class,
      responseType = com.thanh.gen.proto.SeatList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thanh.gen.proto.NumberOfSeats,
      com.thanh.gen.proto.SeatList> getGetMethod() {
    io.grpc.MethodDescriptor<com.thanh.gen.proto.NumberOfSeats, com.thanh.gen.proto.SeatList> getGetMethod;
    if ((getGetMethod = SeatControllerGrpc.getGetMethod) == null) {
      synchronized (SeatControllerGrpc.class) {
        if ((getGetMethod = SeatControllerGrpc.getGetMethod) == null) {
          SeatControllerGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<com.thanh.gen.proto.NumberOfSeats, com.thanh.gen.proto.SeatList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.thanh.grpc.SeatController", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thanh.gen.proto.NumberOfSeats.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thanh.gen.proto.SeatList.getDefaultInstance()))
                  .setSchemaDescriptor(new SeatControllerMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SeatControllerStub newStub(io.grpc.Channel channel) {
    return new SeatControllerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SeatControllerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SeatControllerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SeatControllerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SeatControllerFutureStub(channel);
  }

  /**
   */
  public static abstract class SeatControllerImplBase implements io.grpc.BindableService {

    /**
     */
    public void reserve(com.thanh.gen.proto.SeatList request,
        io.grpc.stub.StreamObserver<com.thanh.gen.proto.ReserveSeatResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReserveMethod(), responseObserver);
    }

    /**
     */
    public void get(com.thanh.gen.proto.NumberOfSeats request,
        io.grpc.stub.StreamObserver<com.thanh.gen.proto.SeatList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReserveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.thanh.gen.proto.SeatList,
                com.thanh.gen.proto.ReserveSeatResponse>(
                  this, METHODID_RESERVE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.thanh.gen.proto.NumberOfSeats,
                com.thanh.gen.proto.SeatList>(
                  this, METHODID_GET)))
          .build();
    }
  }

  /**
   */
  public static final class SeatControllerStub extends io.grpc.stub.AbstractStub<SeatControllerStub> {
    private SeatControllerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SeatControllerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SeatControllerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SeatControllerStub(channel, callOptions);
    }

    /**
     */
    public void reserve(com.thanh.gen.proto.SeatList request,
        io.grpc.stub.StreamObserver<com.thanh.gen.proto.ReserveSeatResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReserveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(com.thanh.gen.proto.NumberOfSeats request,
        io.grpc.stub.StreamObserver<com.thanh.gen.proto.SeatList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SeatControllerBlockingStub extends io.grpc.stub.AbstractStub<SeatControllerBlockingStub> {
    private SeatControllerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SeatControllerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SeatControllerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SeatControllerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.thanh.gen.proto.ReserveSeatResponse reserve(com.thanh.gen.proto.SeatList request) {
      return blockingUnaryCall(
          getChannel(), getReserveMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thanh.gen.proto.SeatList get(com.thanh.gen.proto.NumberOfSeats request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SeatControllerFutureStub extends io.grpc.stub.AbstractStub<SeatControllerFutureStub> {
    private SeatControllerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SeatControllerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SeatControllerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SeatControllerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thanh.gen.proto.ReserveSeatResponse> reserve(
        com.thanh.gen.proto.SeatList request) {
      return futureUnaryCall(
          getChannel().newCall(getReserveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thanh.gen.proto.SeatList> get(
        com.thanh.gen.proto.NumberOfSeats request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RESERVE = 0;
  private static final int METHODID_GET = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SeatControllerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SeatControllerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RESERVE:
          serviceImpl.reserve((com.thanh.gen.proto.SeatList) request,
              (io.grpc.stub.StreamObserver<com.thanh.gen.proto.ReserveSeatResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.thanh.gen.proto.NumberOfSeats) request,
              (io.grpc.stub.StreamObserver<com.thanh.gen.proto.SeatList>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SeatControllerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SeatControllerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.thanh.gen.proto.SeatOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SeatController");
    }
  }

  private static final class SeatControllerFileDescriptorSupplier
      extends SeatControllerBaseDescriptorSupplier {
    SeatControllerFileDescriptorSupplier() {}
  }

  private static final class SeatControllerMethodDescriptorSupplier
      extends SeatControllerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SeatControllerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SeatControllerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SeatControllerFileDescriptorSupplier())
              .addMethod(getReserveMethod())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
