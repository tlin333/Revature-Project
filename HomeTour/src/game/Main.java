package game;

import java.util.Scanner;

public class Main {
	private static Scanner scan = new Scanner(System.in);
	private static RoomManager roomManager = new RoomManager(9);
	private static Player player = new Player();
	private static String[] command;
	private static String direction;
	
	public static void main(String[] args) {
		roomManager.init();
		player.setCurrentRoom(roomManager.getStartingRoom());
		System.out.println("Welcome to my house, enter your name to start the Home Tour" + "\n"
		+ "If you enter the direction command state on the NO ROOM line, you will be direct to the current room you in.");
		collectInput();
		printRoom(player);
		
		while (direction != "quit") {
			collectInput();
			parse(command, player);
			switch(direction) {
			case "north":
				player.setCurrentRoom(player.getCurrentRoom().getExit(direction));
				printRoom(player);
				
			break;
			
			case "south": 
				player.setCurrentRoom(player.getCurrentRoom().getExit(direction));
				printRoom(player);
				
			break;
			
			case "east": 
				player.setCurrentRoom(player.getCurrentRoom().getExit(direction));
				printRoom(player);
				
			break;
			
			case "west": 
				player.setCurrentRoom(player.getCurrentRoom().getExit(direction));
				printRoom(player);
				
			break;
			
			default: 
				System.out.println("Thanks for coming to my house, hope you like it and exit correctly.");
			}
		}
		
	}
		
	private static void printRoom(Player player) {
		System.out.println("\n" + "You are in the " + player.getCurrentRoom().getName());
		System.out.println(player.getCurrentRoom().getShortDescription());
		System.out.println(player.getCurrentRoom().getLongDescription());
		System.out.println("Where you want to go next?");
	}

	private static String[] collectInput() {
		command = scan.nextLine().trim().toLowerCase().split(" ");
		return command;
	}
		
	private static void parse(String[] command, Player player) {
		for (int i = 0; i < command.length; i++) {
			if (command[i].equals("quit")) {
				direction = "quit"; 
			}
			else if(command[i].equals("north")){
				direction = "north";
			}
			else if(command[i].equals("south")) {
					direction = "south";
			}
			else if(command[i].equals("east")) {
				direction = "east";
			}
			else if(command[i].equals("west")) {
				direction = "west";
			}
		}
	}
}
