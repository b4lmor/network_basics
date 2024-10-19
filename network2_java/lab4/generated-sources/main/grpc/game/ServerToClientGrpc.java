package game;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.0)",
    comments = "Source: api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServerToClientGrpc {

  private ServerToClientGrpc() {}

  public static final String SERVICE_NAME = "game.ServerToClient";

  // Static method descriptors that strictly reflect the proto.
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
    if ((getFillSquaresMethod = ServerToClientGrpc.getFillSquaresMethod) == null) {
      synchronized (ServerToClientGrpc.class) {
        if ((getFillSquaresMethod = ServerToClientGrpc.getFillSquaresMethod) == null) {
          ServerToClientGrpc.getFillSquaresMethod = getFillSquaresMethod =
              io.grpc.MethodDescriptor.<game.Api.FillSquaresRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FillSquares"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  game.Api.FillSquaresRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServerToClientMethodDescriptorSupplier("FillSquares"))
              .build();
        }
      }
    }
    return getFillSquaresMethod;
  }

  private static volatile io.grpc.MethodDescriptor<game.Api.EndGameRequest,
      com.google.protobuf.Empty> getEndGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EndGame",
      requestType = game.Api.EndGameRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<game.Api.EndGameRequest,
      com.google.protobuf.Empty> getEndGameMethod() {
    io.grpc.MethodDescriptor<game.Api.EndGameRequest, com.google.protobuf.Empty> getEndGameMethod;
    if ((getEndGameMethod = ServerToClientGrpc.getEndGameMethod) == null) {
      synchronized (ServerToClientGrpc.class) {
        if ((getEndGameMethod = ServerToClientGrpc.getEndGameMethod) == null) {
          ServerToClientGrpc.getEndGameMethod = getEndGameMethod =
              io.grpc.MethodDescriptor.<game.Api.EndGameRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EndGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  game.Api.EndGameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServerToClientMethodDescriptorSupplier("EndGame"))
              .build();
        }
      }
    }
    return getEndGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<game.Api.SendGamesInfoRequest,
      com.google.protobuf.Empty> getSendGamesInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendGamesInfo",
      requestType = game.Api.SendGamesInfoRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<game.Api.SendGamesInfoRequest,
      com.google.protobuf.Empty> getSendGamesInfoMethod() {
    io.grpc.MethodDescriptor<game.Api.SendGamesInfoRequest, com.google.protobuf.Empty> getSendGamesInfoMethod;
    if ((getSendGamesInfoMethod = ServerToClientGrpc.getSendGamesInfoMethod) == null) {
      synchronized (ServerToClientGrpc.class) {
        if ((getSendGamesInfoMethod = ServerToClientGrpc.getSendGamesInfoMethod) == null) {
          ServerToClientGrpc.getSendGamesInfoMethod = getSendGamesInfoMethod =
              io.grpc.MethodDescriptor.<game.Api.SendGamesInfoRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendGamesInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  game.Api.SendGamesInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServerToClientMethodDescriptorSupplier("SendGamesInfo"))
              .build();
        }
      }
    }
    return getSendGamesInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<game.Api.SendGameInfoFullRequest,
      com.google.protobuf.Empty> getSendGameInfoFullMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendGameInfoFull",
      requestType = game.Api.SendGameInfoFullRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<game.Api.SendGameInfoFullRequest,
      com.google.protobuf.Empty> getSendGameInfoFullMethod() {
    io.grpc.MethodDescriptor<game.Api.SendGameInfoFullRequest, com.google.protobuf.Empty> getSendGameInfoFullMethod;
    if ((getSendGameInfoFullMethod = ServerToClientGrpc.getSendGameInfoFullMethod) == null) {
      synchronized (ServerToClientGrpc.class) {
        if ((getSendGameInfoFullMethod = ServerToClientGrpc.getSendGameInfoFullMethod) == null) {
          ServerToClientGrpc.getSendGameInfoFullMethod = getSendGameInfoFullMethod =
              io.grpc.MethodDescriptor.<game.Api.SendGameInfoFullRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendGameInfoFull"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  game.Api.SendGameInfoFullRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServerToClientMethodDescriptorSupplier("SendGameInfoFull"))
              .build();
        }
      }
    }
    return getSendGameInfoFullMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServerToClientStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerToClientStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerToClientStub>() {
        @java.lang.Override
        public ServerToClientStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerToClientStub(channel, callOptions);
        }
      };
    return ServerToClientStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServerToClientBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerToClientBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerToClientBlockingStub>() {
        @java.lang.Override
        public ServerToClientBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerToClientBlockingStub(channel, callOptions);
        }
      };
    return ServerToClientBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServerToClientFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerToClientFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerToClientFutureStub>() {
        @java.lang.Override
        public ServerToClientFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerToClientFutureStub(channel, callOptions);
        }
      };
    return ServerToClientFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ServerToClientImplBase implements io.grpc.BindableService {

    /**
     */
    public void fillSquares(game.Api.FillSquaresRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFillSquaresMethod(), responseObserver);
    }

    /**
     */
    public void endGame(game.Api.EndGameRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEndGameMethod(), responseObserver);
    }

    /**
     */
    public void sendGamesInfo(game.Api.SendGamesInfoRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendGamesInfoMethod(), responseObserver);
    }

    /**
     */
    public void sendGameInfoFull(game.Api.SendGameInfoFullRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendGameInfoFullMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFillSquaresMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                game.Api.FillSquaresRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_FILL_SQUARES)))
          .addMethod(
            getEndGameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                game.Api.EndGameRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_END_GAME)))
          .addMethod(
            getSendGamesInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                game.Api.SendGamesInfoRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SEND_GAMES_INFO)))
          .addMethod(
            getSendGameInfoFullMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                game.Api.SendGameInfoFullRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SEND_GAME_INFO_FULL)))
          .build();
    }
  }

  /**
   */
  public static final class ServerToClientStub extends io.grpc.stub.AbstractAsyncStub<ServerToClientStub> {
    private ServerToClientStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerToClientStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerToClientStub(channel, callOptions);
    }

    /**
     */
    public void fillSquares(game.Api.FillSquaresRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFillSquaresMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void endGame(game.Api.EndGameRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEndGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendGamesInfo(game.Api.SendGamesInfoRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendGamesInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendGameInfoFull(game.Api.SendGameInfoFullRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendGameInfoFullMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServerToClientBlockingStub extends io.grpc.stub.AbstractBlockingStub<ServerToClientBlockingStub> {
    private ServerToClientBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerToClientBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerToClientBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty fillSquares(game.Api.FillSquaresRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFillSquaresMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty endGame(game.Api.EndGameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEndGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty sendGamesInfo(game.Api.SendGamesInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendGamesInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty sendGameInfoFull(game.Api.SendGameInfoFullRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendGameInfoFullMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServerToClientFutureStub extends io.grpc.stub.AbstractFutureStub<ServerToClientFutureStub> {
    private ServerToClientFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerToClientFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerToClientFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> fillSquares(
        game.Api.FillSquaresRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFillSquaresMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> endGame(
        game.Api.EndGameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEndGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> sendGamesInfo(
        game.Api.SendGamesInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendGamesInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> sendGameInfoFull(
        game.Api.SendGameInfoFullRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendGameInfoFullMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FILL_SQUARES = 0;
  private static final int METHODID_END_GAME = 1;
  private static final int METHODID_SEND_GAMES_INFO = 2;
  private static final int METHODID_SEND_GAME_INFO_FULL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServerToClientImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServerToClientImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FILL_SQUARES:
          serviceImpl.fillSquares((game.Api.FillSquaresRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_END_GAME:
          serviceImpl.endGame((game.Api.EndGameRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SEND_GAMES_INFO:
          serviceImpl.sendGamesInfo((game.Api.SendGamesInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SEND_GAME_INFO_FULL:
          serviceImpl.sendGameInfoFull((game.Api.SendGameInfoFullRequest) request,
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

  private static abstract class ServerToClientBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServerToClientBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return game.Api.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServerToClient");
    }
  }

  private static final class ServerToClientFileDescriptorSupplier
      extends ServerToClientBaseDescriptorSupplier {
    ServerToClientFileDescriptorSupplier() {}
  }

  private static final class ServerToClientMethodDescriptorSupplier
      extends ServerToClientBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServerToClientMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServerToClientGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServerToClientFileDescriptorSupplier())
              .addMethod(getFillSquaresMethod())
              .addMethod(getEndGameMethod())
              .addMethod(getSendGamesInfoMethod())
              .addMethod(getSendGameInfoFullMethod())
              .build();
        }
      }
    }
    return result;
  }
}
