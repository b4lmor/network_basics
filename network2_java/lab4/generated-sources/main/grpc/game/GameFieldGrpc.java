package game;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.0)",
    comments = "Source: api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GameFieldGrpc {

  private GameFieldGrpc() {}

  public static final String SERVICE_NAME = "game.GameField";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<game.Api.FillSquareRequest,
      com.google.protobuf.Empty> getFillSquareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FillSquare",
      requestType = game.Api.FillSquareRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<game.Api.FillSquareRequest,
      com.google.protobuf.Empty> getFillSquareMethod() {
    io.grpc.MethodDescriptor<game.Api.FillSquareRequest, com.google.protobuf.Empty> getFillSquareMethod;
    if ((getFillSquareMethod = GameFieldGrpc.getFillSquareMethod) == null) {
      synchronized (GameFieldGrpc.class) {
        if ((getFillSquareMethod = GameFieldGrpc.getFillSquareMethod) == null) {
          GameFieldGrpc.getFillSquareMethod = getFillSquareMethod =
              io.grpc.MethodDescriptor.<game.Api.FillSquareRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FillSquare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  game.Api.FillSquareRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .build();
        }
      }
    }
    return getFillSquareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<game.Api.FillSquaresRequest,
      com.google.protobuf.Empty> getFillSquaresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FillSquares",
      requestType = game.Api.FillSquaresRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<game.Api.FillSquaresRequest,
      com.google.protobuf.Empty> getFillSquaresMethod() {
    io.grpc.MethodDescriptor<game.Api.FillSquaresRequest, com.google.protobuf.Empty> getFillSquaresMethod;
    if ((getFillSquaresMethod = GameFieldGrpc.getFillSquaresMethod) == null) {
      synchronized (GameFieldGrpc.class) {
        if ((getFillSquaresMethod = GameFieldGrpc.getFillSquaresMethod) == null) {
          GameFieldGrpc.getFillSquaresMethod = getFillSquaresMethod =
              io.grpc.MethodDescriptor.<game.Api.FillSquaresRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FillSquares"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  game.Api.FillSquaresRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .build();
        }
      }
    }
    return getFillSquaresMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GameFieldStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GameFieldStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GameFieldStub>() {
        @java.lang.Override
        public GameFieldStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GameFieldStub(channel, callOptions);
        }
      };
    return GameFieldStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GameFieldBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GameFieldBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GameFieldBlockingStub>() {
        @java.lang.Override
        public GameFieldBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GameFieldBlockingStub(channel, callOptions);
        }
      };
    return GameFieldBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GameFieldFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GameFieldFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GameFieldFutureStub>() {
        @java.lang.Override
        public GameFieldFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GameFieldFutureStub(channel, callOptions);
        }
      };
    return GameFieldFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GameFieldImplBase implements io.grpc.BindableService {

    /**
     */
    public void fillSquare(game.Api.FillSquareRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFillSquareMethod(), responseObserver);
    }

    /**
     */
    public void fillSquares(game.Api.FillSquaresRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFillSquaresMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFillSquareMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                game.Api.FillSquareRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_FILL_SQUARE)))
          .addMethod(
            getFillSquaresMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                game.Api.FillSquaresRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_FILL_SQUARES)))
          .build();
    }
  }

  /**
   */
  public static final class GameFieldStub extends io.grpc.stub.AbstractAsyncStub<GameFieldStub> {
    private GameFieldStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameFieldStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GameFieldStub(channel, callOptions);
    }

    /**
     */
    public void fillSquare(game.Api.FillSquareRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFillSquareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fillSquares(game.Api.FillSquaresRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFillSquaresMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GameFieldBlockingStub extends io.grpc.stub.AbstractBlockingStub<GameFieldBlockingStub> {
    private GameFieldBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameFieldBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GameFieldBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty fillSquare(game.Api.FillSquareRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFillSquareMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty fillSquares(game.Api.FillSquaresRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFillSquaresMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GameFieldFutureStub extends io.grpc.stub.AbstractFutureStub<GameFieldFutureStub> {
    private GameFieldFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameFieldFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GameFieldFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> fillSquare(
        game.Api.FillSquareRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFillSquareMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> fillSquares(
        game.Api.FillSquaresRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFillSquaresMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FILL_SQUARE = 0;
  private static final int METHODID_FILL_SQUARES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GameFieldImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GameFieldImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FILL_SQUARE:
          serviceImpl.fillSquare((game.Api.FillSquareRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_FILL_SQUARES:
          serviceImpl.fillSquares((game.Api.FillSquaresRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GameFieldGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getFillSquareMethod())
              .addMethod(getFillSquaresMethod())
              .build();
        }
      }
    }
    return result;
  }
}
