package robot

import (
	"lab4/cli"
	"lab4/internal/context"
	"lab4/internal/entity"
	"lab4/internal/network"
	"time"
)

func RunRobotCreator(args *cli.ProgArgs, ctx *context.Context, nm *network.NodeMaster) {
	ctx.InitNewGame(30, 30, 10, 1000, "robot-master", "robot-game")
}

func RunRobotPlayer(args *cli.ProgArgs, ctx *context.Context, nm *network.NodeMaster) {
	go func() {
		time.Sleep(5 * time.Second)
		nm.SendJoin(args.FSocket, "mr_robot", "")
		for {
			time.Sleep(3 * time.Second)
			nm.SendSteer(0, args.FSocket, entity.NewDirectionRandom())
		}
	}()
}
