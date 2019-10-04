import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String codeword = "CODEISCOOL";

		String playAgain = "y";
		while (playAgain.toLowerCase().equals("y")) {
			String input = "";
			while (!input.equals(codeword)) {
				System.out.print("Enter the code word!!: ");
				input = scan.next();
				if (!input.contentEquals(codeword))
					System.out.println("HAHAHA! Try again... ");
			}
			System.out.print("Good job! Want to play again? y/n: ");
			playAgain = scan.next();
		}
		System.out.println("Game over. Goodbye!");
    scan.close();
	}

}
