import java.util.Scanner;

public class BreakDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number between 1 and 20: ");

		int inputSearch = scan.nextInt();

		int[] arrayOfInts = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int i;
		boolean foundIt = false;

		for (i = 0; i < arrayOfInts.length; i++) {
			if (arrayOfInts[i] == inputSearch) {
				foundIt = true;

				break;
			}

		}

		if (foundIt) {
			System.out.println("The array contains your selected number!");
			System.out.println("The index your number is located at is: " + i);
		} else {
			foundIt = false;
			System.out.println("Your number is not contained in the array... Whomp whomp");
		}

		scan.close();
	}

}
