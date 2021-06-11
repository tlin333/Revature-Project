package Main;

import java.util.Scanner;

public class Converter {
	static Scanner myScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int menu; 
		System.out.println(" 1: Cups to Teaspoons");
		System.out.println(" 2: Miles to Kilometers");
		System.out.println(" 3: US Gallons to Imperial Gallons");
		System.out.println(" 4: Quit");
		System.out.println("Select an option from the menu: ");
		
		menu = myScanner.nextInt(); 

		while(menu!=4){
			switch(menu) {
			case (1):
				//Cups to teaspoons
				double cups = getCups();
				double teaspoons = convertCupsToTeaspoons(cups);
				System.out.println( cups + " cups are equals to " + teaspoons + " teaspoons");

				// enter new selection for while loop
				System.out.println("Enter the menu option again for conversion, otherwise enter 4 to quit: ");
				menu = myScanner.nextInt();

			break;

			case (2):
				//Miles to Kilometers
				double miles = getMiles();
				double kilometers =  convertMilesToKilometers(miles);
				System.out.println(miles + " miles are equals to " + kilometers + " kilometers");

				// enter new selection for while loop
				System.out.println("Enter the menu option again for conversion, otherwise enter 4 to quit: ");
				menu = myScanner.nextInt();

			break;

			case (3):
				//US Gallons to Imperial Gallons
				double USGallons = getUSGallons();
				double imperialGallons = convertUSGallonsToImperialGallons(USGallons);
				System.out.println( USGallons + "US Gallons are equals to " + imperialGallons + " imperial Gallons");

				//enter new selection for while loop
				System.out.println("Enter the menu option again for conversion, otherwise enter 4 to quit: ");
				menu = myScanner.nextInt();

			break;

			default:
				System.out.println("Invalid menu option.Please try again: ");
				System.out.println("Enter the menu option again for confusion, otherwise enter 4 to quit: ");
				menu = myScanner.nextInt();
			}

		}
		System.out.println("Quit");
	}


	public static double getCups(){
		System.out.print("Enter the number of Cups: ");
		double cups = myScanner.nextDouble();
		return(cups);
	}

	public static double convertCupsToTeaspoons(double cups){
		//1 cup = 48 teaspoons
		double teaspoons = cups*48;
		return(teaspoons);
	}


	public static double getMiles(){
		System.out.print("Enter the number of miles: ");
		double miles = myScanner.nextDouble();
		return(miles);
	}


	public static double convertMilesToKilometers(double miles){
		// 1 mile = 1.60 kilometers
		double kilometers = miles*1.60;
		return (kilometers);
	}

	public static double getUSGallons(){
		System.out.print("Enter the number of US Gallons: ");
		double USGallons = myScanner.nextDouble();
		return(USGallons);
	}

	public static double convertUSGallonsToImperialGallons(double USGallons){
		// 1 mile = 0.832674 ImperialGallons
		double ImperialGallons = USGallons*0.832674;
		return (ImperialGallons);
	}
}
