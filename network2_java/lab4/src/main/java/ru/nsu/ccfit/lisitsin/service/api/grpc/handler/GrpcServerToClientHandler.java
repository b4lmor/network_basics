package ru.nsu.ccfit.lisitsin.service.api.grpc.handler;

import com.google.protobuf.Empty;
import game.Api;
import game.ServerToClientGrpc;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.nsu.ccfit.lisitsin.service.core.service.GameFieldService;
import ru.nsu.ccfit.lisitsin.service.core.service.GameInfoService;
import ru.nsu.ccfit.lisitsin.service.core.service.GameListService;
import ru.nsu.ccfit.lisitsin.service.mapper.Mapper;

@Slf4j
@Component
@RequiredArgsConstructor
public class GrpcServerToClientHandler extends ServerToClientGrpc.ServerToClientImplBase {

    private final GameFieldService gameFieldService;

    private final GameListService gameListService;

    private final GameInfoService gameInfoService;

    @Override
    public void fillSquares(Api.FillSquaresRequest request, StreamObserver<Empty> responseObserver) {
        log.trace("Accepted 'fillSquares' request with length = {}", request.getPointsList().size());
        gameFieldService.paint(Mapper.map(request));
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void sendGamesInfo(Api.SendGamesInfoRequest request, StreamObserver<Empty> responseObserver) {
        gameListService.alter(request.getGameInfoList().stream().map(Mapper::map).toList());
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void sendGameInfoFull(Api.SendGameInfoFullRequest request, StreamObserver<Empty> responseObserver) {
        boolean success = gameFieldService.setUnitSize(request.getWidth(), request.getHeight());
        if (success) {
            gameInfoService.alter(Mapper.map(request));
        }
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void endGame(Api.EndGameRequest request, StreamObserver<Empty> responseObserver) {
        gameFieldService.endGame(request.getScore());
        gameInfoService.clear();
    }
}
