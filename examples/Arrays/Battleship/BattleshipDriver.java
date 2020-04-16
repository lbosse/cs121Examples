import java.awt.Point;
import java.util.Scanner;

public class BattleshipDriver {

	public static void main(String[] args) {
		String playAgain = "y";
		Scanner scan = new Scanner(System.in);

		while (playAgain.equalsIgnoreCase("y")) {
			BattleshipGame game = new BattleshipGame(10);
			while (!game.won()) {
				// Print game grid
				System.out.println(game);

				// Get choice
				int x, y;
				boolean choice;
				do {
					System.out.println("Where shall we direct our fire?");
					System.out.print("X: ");
					x = Integer.parseInt(scan.nextLine());
					System.out.print("Y: ");
					y = Integer.parseInt(scan.nextLine());
					choice = game.choose(x, y);
					if (!choice) { // Try again if choice was invalid
						System.out.println("That choice is out of range! Try again:");
					}
				} while (!choice);
			}
			// Print out win message
			Point[] moves = game.getMoves();
			System.out.println("You won! You took " + moves.length + " moves. Here are your moves:");
			for (Point p: moves) {
				System.out.println(p);
			}
			System.out.print("Play again? (Y/N): ");
			playAgain = scan.nextLine().trim();
		}
		scan.close();
	}

}
