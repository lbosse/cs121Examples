import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// Set up Scanner and random number generator
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		// Set up yes/no for play again. Of course we want to play the first time.
		String yOrN = "y";
		
		while (yOrN.equals("y")) {
		
			// Generate random answer and get a guess from the user
			int answer = rand.nextInt(10) + 1;
			System.out.println("Enter a number: ");
			int guess = scan.nextInt();

			// Check our guess
			while (guess != answer) {
				if (guess < 1 || guess > 10) { // Check the range
					System.out.println("out of range! guess again: ");
				} else {
					System.out.println("Sorry that was incorrect! Guess again: ");
				}
				// Guess again if incorrect
				guess = scan.nextInt();
			}
			
			// Yay! You got it right :) Want to play again?
			System.out.println("you got it! Good guessing :)");
			System.out.println("Would you like to play again? (y/n): ");
			yOrN = scan.next();
		}
	}

}
