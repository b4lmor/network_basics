package ru.nsu.ccfit.lisitsin.service.api.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.nsu.ccfit.lisitsin.service.api.grpc.handler.GrpcServerToClientHandler;
import ru.nsu.ccfit.lisitsin.service.config.PropertiesConfig;

import java.io.IOException;

@Slf4j
@Component
@RequiredArgsConstructor
public class GrpcServer {

    private final GrpcServerToClientHandler grpcServerToClientHandler;

    private final PropertiesConfig propertiesConfig;

    private Server server;

    @PostConstruct
    public void init() {
        this.server = ServerBuilder.forPort(propertiesConfig.clientPort())
                .addService(grpcServerToClientHandler)
                .addService(ProtoReflectionService.newInstance())
                .build();
    }

    public void start() throws IOException {
        server.start();
        log.info("gRPC server started on port {}", server.getPort());
    }

    public void awaitTermination() throws InterruptedException {
        server.awaitTermination();
    }
}
