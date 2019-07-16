import java.util.Scanner;

public class Lab3Project {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("What is your name Friend?");
		String userName = scan.next();
		
		//Garbage collection
		// scan.nextLine();
		
		// char userChar = scan.next().charAt(0);
		char userChar = 'y';
		
		while (userChar == 'y') {
		System.out.println("Enter a number between 1 and 100!");

		int userInt = scan.nextInt();

		if (userInt >= 1 && userInt <= 100) {

			if (userInt % 2 == 1 && userInt > 60) {
				System.out.println(userName + ", your number is " + userInt + " and is odd and over 60");
			} else if (userInt % 2 == 1) {
				System.out.println(userName + ", your number is " + userInt + " and it is odd.");
			} else if (userInt % 2 == 0 && userInt <= 25 && userInt >= 2) {
				System.out.println(userName + ", your number is " + userInt + " and it is even and less than 25.");
			} else if (userInt % 2 == 0 && userInt > 60) {
				System.out.println(userName + ", your number is " + userInt + " and is even and greater than 60.");
			} else if (userInt % 2 == 0 && userInt >= 26 && userInt <= 60) {
				System.out.println(userName + ", your number is " + userInt + " and is even.");
			} else {
				System.out.println("You broke the program!");
			}
		} 
		else if (userInt < 1 || userInt > 100) {
			System.out.println("You did not choose an appropriate number");   //This is my validation to ensure the user chose a number b/n 1 & 100
		}

		else {
			System.out.println("Have a good day!");
		}
		System.out.println("Would you like to continue? (y/n)");
		
		userChar = scan.next().charAt(0); 
		
	}
		System.out.println("Take it easy!");
		
		
		
		
		
		
		scan.close();

	}
}
