package game;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.0)",
    comments = "Source: api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClientToServerGrpc {

  private ClientToServerGrpc() {}

  public static final String SERVICE_NAME = "game.ClientToServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<game.Api.CreateGameRequest,
      game.Api.CreateGameResponse> getCreateGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGame",
      requestType = game.Api.CreateGameRequest.class,
      responseType = game.Api.CreateGameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<game.Api.CreateGameRequest,
      game.Api.CreateGameResponse> getCreateGameMethod() {
    io.grpc.MethodDescriptor<game.Api.CreateGameRequest, game.Api.CreateGameResponse> getCreateGameMethod;
    if ((getCreateGameMethod = ClientToServerGrpc.getCreateGameMethod) == null) {
      synchronized (ClientToServerGrpc.class) {
        if ((getCreateGameMethod = ClientToServerGrpc.getCreateGameMethod) == null) {
          ClientToServerGrpc.getCreateGameMethod = getCreateGameMethod =
              io.grpc.MethodDescriptor.<game.Api.CreateGameRequest, game.Api.CreateGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  game.Api.CreateGameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  game.Api.CreateGameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientToServerMethodDescriptorSupplier("CreateGame"))
              .build();
        }
      }
    }
    return getCreateGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<game.Api.JoinGameRequest,
      game.Api.JoinGameResponse> getJoinGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JoinGame",
      requestType = game.Api.JoinGameRequest.class,
      responseType = game.Api.JoinGameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<game.Api.JoinGameRequest,
      game.Api.JoinGameResponse> getJoinGameMethod() {
    io.grpc.MethodDescriptor<game.Api.JoinGameRequest, game.Api.JoinGameResponse> getJoinGameMethod;
    if ((getJoinGameMethod = ClientToServerGrpc.getJoinGameMethod) == null) {
      synchronized (ClientToServerGrpc.class) {
        if ((getJoinGameMethod = ClientToServerGrpc.getJoinGameMethod) == null) {
          ClientToServerGrpc.getJoinGameMethod = getJoinGameMethod =
              io.grpc.MethodDescriptor.<game.Api.JoinGameRequest, game.Api.JoinGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JoinGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  game.Api.JoinGameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  game.Api.JoinGameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientToServerMethodDescriptorSupplier("JoinGame"))
              .build();
        }
      }
    }
    return getJoinGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getLeaveGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LeaveGame",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getLeaveGameMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getLeaveGameMethod;
    if ((getLeaveGameMethod = ClientToServerGrpc.getLeaveGameMethod) == null) {
      synchronized (ClientToServerGrpc.class) {
        if ((getLeaveGameMethod = ClientToServerGrpc.getLeaveGameMethod) == null) {
          ClientToServerGrpc.getLeaveGameMethod = getLeaveGameMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LeaveGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ClientToServerMethodDescriptorSupplier("LeaveGame"))
              .build();
        }
      }
    }
    return getLeaveGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<game.Api.SendDirectionRequest,
      com.google.protobuf.Empty> getSendDirectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendDirection",
      requestType = game.Api.SendDirectionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<game.Api.SendDirectionRequest,
      com.google.protobuf.Empty> getSendDirectionMethod() {
    io.grpc.MethodDescriptor<game.Api.SendDirectionRequest, com.google.protobuf.Empty> getSendDirectionMethod;
    if ((getSendDirectionMethod = ClientToServerGrpc.getSendDirectionMethod) == null) {
      synchronized (ClientToServerGrpc.class) {
        if ((getSendDirectionMethod = ClientToServerGrpc.getSendDirectionMethod) == null) {
          ClientToServerGrpc.getSendDirectionMethod = getSendDirectionMethod =
              io.grpc.MethodDescriptor.<game.Api.SendDirectionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendDirection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  game.Api.SendDirectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ClientToServerMethodDescriptorSupplier("SendDirection"))
              .build();
        }
      }
    }
    return getSendDirectionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientToServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientToServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientToServerStub>() {
        @java.lang.Override
        public ClientToServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientToServerStub(channel, callOptions);
        }
      };
    return ClientToServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientToServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientToServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientToServerBlockingStub>() {
        @java.lang.Override
        public ClientToServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientToServerBlockingStub(channel, callOptions);
        }
      };
    return ClientToServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientToServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientToServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientToServerFutureStub>() {
        @java.lang.Override
        public ClientToServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientToServerFutureStub(channel, callOptions);
        }
      };
    return ClientToServerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ClientToServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void createGame(game.Api.CreateGameRequest request,
        io.grpc.stub.StreamObserver<game.Api.CreateGameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateGameMethod(), responseObserver);
    }

    /**
     */
    public void joinGame(game.Api.JoinGameRequest request,
        io.grpc.stub.StreamObserver<game.Api.JoinGameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getJoinGameMethod(), responseObserver);
    }

    /**
     */
    public void leaveGame(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLeaveGameMethod(), responseObserver);
    }

    /**
     */
    public void sendDirection(game.Api.SendDirectionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendDirectionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateGameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                game.Api.CreateGameRequest,
                game.Api.CreateGameResponse>(
                  this, METHODID_CREATE_GAME)))
          .addMethod(
            getJoinGameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                game.Api.JoinGameRequest,
                game.Api.JoinGameResponse>(
                  this, METHODID_JOIN_GAME)))
          .addMethod(
            getLeaveGameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.google.protobuf.Empty>(
                  this, METHODID_LEAVE_GAME)))
          .addMethod(
            getSendDirectionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                game.Api.SendDirectionRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SEND_DIRECTION)))
          .build();
    }
  }

  /**
   */
  public static final class ClientToServerStub extends io.grpc.stub.AbstractAsyncStub<ClientToServerStub> {
    private ClientToServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientToServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientToServerStub(channel, callOptions);
    }

    /**
     */
    public void createGame(game.Api.CreateGameRequest request,
        io.grpc.stub.StreamObserver<game.Api.CreateGameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void joinGame(game.Api.JoinGameRequest request,
        io.grpc.stub.StreamObserver<game.Api.JoinGameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getJoinGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void leaveGame(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLeaveGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendDirection(game.Api.SendDirectionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendDirectionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClientToServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<ClientToServerBlockingStub> {
    private ClientToServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientToServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientToServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public game.Api.CreateGameResponse createGame(game.Api.CreateGameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public game.Api.JoinGameResponse joinGame(game.Api.JoinGameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getJoinGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty leaveGame(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLeaveGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty sendDirection(game.Api.SendDirectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendDirectionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClientToServerFutureStub extends io.grpc.stub.AbstractFutureStub<ClientToServerFutureStub> {
    private ClientToServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientToServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientToServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<game.Api.CreateGameResponse> createGame(
        game.Api.CreateGameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<game.Api.JoinGameResponse> joinGame(
        game.Api.JoinGameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getJoinGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> leaveGame(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLeaveGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> sendDirection(
        game.Api.SendDirectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendDirectionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_GAME = 0;
  private static final int METHODID_JOIN_GAME = 1;
  private static final int METHODID_LEAVE_GAME = 2;
  private static final int METHODID_SEND_DIRECTION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClientToServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClientToServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_GAME:
          serviceImpl.createGame((game.Api.CreateGameRequest) request,
              (io.grpc.stub.StreamObserver<game.Api.CreateGameResponse>) responseObserver);
          break;
        case METHODID_JOIN_GAME:
          serviceImpl.joinGame((game.Api.JoinGameRequest) request,
              (io.grpc.stub.StreamObserver<game.Api.JoinGameResponse>) responseObserver);
          break;
        case METHODID_LEAVE_GAME:
          serviceImpl.leaveGame((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SEND_DIRECTION:
          serviceImpl.sendDirection((game.Api.SendDirectionRequest) request,
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

  private static abstract class ClientToServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientToServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return game.Api.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientToServer");
    }
  }

  private static final class ClientToServerFileDescriptorSupplier
      extends ClientToServerBaseDescriptorSupplier {
    ClientToServerFileDescriptorSupplier() {}
  }

  private static final class ClientToServerMethodDescriptorSupplier
      extends ClientToServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClientToServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClientToServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientToServerFileDescriptorSupplier())
              .addMethod(getCreateGameMethod())
              .addMethod(getJoinGameMethod())
              .addMethod(getLeaveGameMethod())
              .addMethod(getSendDirectionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
