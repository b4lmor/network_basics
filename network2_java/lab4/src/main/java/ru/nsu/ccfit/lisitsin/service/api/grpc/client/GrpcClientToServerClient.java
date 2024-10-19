package ru.nsu.ccfit.lisitsin.service.api.grpc.client;

import com.google.protobuf.Empty;
import game.Api;
import game.ClientToServerGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.nsu.ccfit.lisitsin.service.config.PropertiesConfig;
import ru.nsu.ccfit.lisitsin.service.core.entity.Direction;
import ru.nsu.ccfit.lisitsin.service.core.error.ServiceException;
import ru.nsu.ccfit.lisitsin.service.mapper.Mapper;

import java.util.Optional;

@Slf4j
@Component
public class GrpcClientToServerClient {

    private final ClientToServerGrpc.ClientToServerBlockingStub blockingStub;

    @Autowired
    public GrpcClientToServerClient(PropertiesConfig propertiesConfig) {
        log.info("Connecting to gRPC server at {}:{}", propertiesConfig.serverHost(), propertiesConfig.serverPort());
        ManagedChannel channel = ManagedChannelBuilder.forAddress(
                        propertiesConfig.serverHost(),
                        propertiesConfig.serverPort()
                )
                .usePlaintext()
                .build();
        this.blockingStub = ClientToServerGrpc.newBlockingStub(channel);
    }

    public Optional<ServiceException> createGame(String gameName, String nickname, int width, int height, int food) {
        Api.CreateGameRequest request = Api.CreateGameRequest.newBuilder()
                .setGameName(gameName)
                .setNickname(nickname)
                .setWidth(width)
                .setHeight(height)
                .setFood(food)
                .build();
        try {
            Api.CreateGameResponse response = blockingStub.createGame(request);
            if (response.getSuccess()) {
                return Optional.empty();
            } else {
                return Optional.of(ServiceException.builder().message(response.getMessage()).build());
            }
        } catch (StatusRuntimeException e) {
            log.error(e.getMessage());
            return Optional.of(ServiceException.builder().message("Не удалось подключиться к серверу.").build());
        }
    }

    public Optional<ServiceException> joinGame(String address, String nickname) {
        Api.JoinGameRequest request = Api.JoinGameRequest.newBuilder()
                .setNickname(nickname)
                .setAddress(address)
                .build();
        try {
            Api.JoinGameResponse response = blockingStub.joinGame(request);
            if (response.getSuccess()) {
                return Optional.empty();
            } else {
                return Optional.of(ServiceException.builder().message(response.getMessage()).build());
            }
        } catch (StatusRuntimeException e) {
            log.error(e.getMessage());
            return Optional.of(ServiceException.builder().message("Не удалось подключиться к серверу.").build());
        }
    }

    public Optional<ServiceException> leaveGame() {
        try {
            blockingStub.leaveGame(Empty.newBuilder().build());
            return Optional.empty();
        } catch (StatusRuntimeException e) {
            log.error(e.getMessage());
            return Optional.of(ServiceException.builder().message("Не удалось подключиться к серверу.").build());
        }
    }

    public Optional<ServiceException> sendDirection(Direction direction) {
        Api.SendDirectionRequest request = Api.SendDirectionRequest.newBuilder()
                .setDirection(Mapper.map(direction))
                .build();
        try {
            blockingStub.sendDirection(request);
            return Optional.empty();
        } catch (StatusRuntimeException e) {
            log.error(e.getMessage());
            return Optional.of(ServiceException.builder().message("Не удалось подключиться к серверу.").build());
        }
    }

}
