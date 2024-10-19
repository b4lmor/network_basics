package main

import (
	"lab4/cli"
	"lab4/internal/context"
	"lab4/internal/desktop/client"
	"lab4/internal/desktop/server"
	"lab4/internal/network"
	"lab4/internal/robot"
	"lab4/internal/routine"
)

func main() {
	args := cli.Parse()
	ctx := context.NewContext(args.GSocket)
	nodeMaster := network.NewNodeMaster(ctx)

	if args.ServerType == "d" {
		ctx.DesktopClient = client.NewS2CClient(args.CSocket)
		go server.NewServer(args.SSocket, ctx, nodeMaster).Start()
	} else if args.ServerType == "rc" {
		robot.RunRobotCreator(args, ctx, nodeMaster)
	} else if args.ServerType == "r" {
		robot.RunRobotPlayer(args, ctx, nodeMaster)
	}

	routine.StartGameRoutine(ctx, nodeMaster)
}
