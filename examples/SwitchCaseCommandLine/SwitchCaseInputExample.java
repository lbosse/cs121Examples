import java.util.Scanner;

public class SwitchCaseInputExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = "";
		System.out.println("Please select an option: L, S, A, P, or Q");

		while (!input.toLowerCase().equals("q")) {
			input = scan.next();
			switch (input.toLowerCase()) {
			case "l":
				System.out.println("The user entered \"L\"");
				break;
			case "s":
				System.out.println("The user entered \"S\"");
				break;
			case "a":
				System.out.println("The user entered \"A\"");
				break;
			case "p":
				System.out.println("The user entered \"P\"");
				break;
			case "q":
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("Not a valid option!");
			}
		}
		scan.close();

	}

}
