package game;

import java.util.Scanner;

public class Main {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Player player = new Player();
		System.out.println("Enter your name to start the Home Tour");
		String name = scan.nextLine();
	}
		
	private static void printRoom(Player player) {
		
	}

	private static String[] collectInput() {
		System.out.println("Enter the direction");
		String s = scan.nextLine();
		String[] result = s.split(" ");
		return result;
	}
		
	private static void parse(String[] command, Player player) {

	}

}
