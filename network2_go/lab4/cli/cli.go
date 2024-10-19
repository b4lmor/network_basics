package cli

import (
	"flag"
	"log"
)

type ProgArgs struct {
	ServerType, GSocket, SSocket, CSocket, FSocket string
}

func Parse() *ProgArgs {
	serverType := flag.String("type", "d", "Server type:\n\t'd' - default,\n\t'rc' - robot that will create a new game,\n\t'r' - robot that will connect to your game in 5 seconds")
	gsocket := flag.String("gsocket", "192.168.0.79:8082", "Socket for the game")
	ssocket := flag.String("ssocket", "", "Socket for the internal desktop server")
	csocket := flag.String("csocket", "", "Socket for the internal desktop client")
	fsocket := flag.String("fsocket", "", "Socket for the type 'r' to connect to")
	flag.Parse()

	if *serverType == "" {
		log.Fatal("Error: -type is required.")
	}
	if *gsocket == "" {
		log.Fatalln("Error: --gsocket is required.")
	}
	if *serverType == "d" && *fsocket != "" {
		log.Fatal("Error: only robots can automatically join foreign game.")
	}
	if *serverType == "d" && (*ssocket == "" || *csocket == "") {
		log.Fatal("Error: default game must have client and server sockets.")
	}
	if *serverType != "d" && (*ssocket != "" || *csocket != "") {
		log.Fatal("Error: --ssocket and --csocket cannot be applied when game is robotic.")
	}

	return &ProgArgs{*serverType, *gsocket, *ssocket, *csocket, *fsocket}
}
