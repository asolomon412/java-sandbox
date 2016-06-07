import java.util.Scanner;

public class MyAdventure {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose an option below: ");
		System.out.println("Option 1: What's your magical talent?");
		System.out.println("Option 2: What's your dream vacation destination?");

		String input = scan.nextLine().toLowerCase();

		switch (input) {
		case "option 1":
			System.out.println("What month is your birthday in? ");
			String newInput = scan.nextLine().toLowerCase();
			System.out.println("Magical talent meter calculating...");

			switch (newInput) {
			case "january":
			case "november":
				System.out.println("You're a fairy queen!");
				break;
			case "february":
			case "august":
			case "december":
				System.out.println("You're a golden star!");
				break;
			case "march":
			case "may":
			case "october":
				System.out.println("You're a wizard!");
				break;
			case "april":
			case "june":
			case "july":
				System.out.println("You're a magician!");

				break;
			default:
				System.out.println("You must enter a valid month!");
				break;
			}
			break;
		case "option 2":
			System.out.println("What month is your birthday in?");
			String newInputTwo = scan.nextLine().toLowerCase();
			System.out.println("Your destination vacation is... ");

			switch (newInputTwo) {
			case "january":
			case "november":
				System.out.println("Las Vegas!");
				break;
			case "february":
			case "august":
			case "december":
				System.out.println("Bermuda!");
				break;
			case "march":
			case "may":
			case "october":
				System.out.println("Jamaica!");
				break;
			case "april":
			case "june":
			case "july":
				System.out.println("Trinidad!");
				break;
			default:
				System.out.println("You must enter a valid month!");
			}
			break;
		default:
			System.out.println("You must enter a valid option!");
			break;
		}
		scan.close();
	}

}
