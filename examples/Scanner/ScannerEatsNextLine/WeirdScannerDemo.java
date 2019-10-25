import java.util.Scanner;

public class WeirdScannerDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = scan.nextInt();
		System.out.print("Enter a String: ");
		/*
		 * nextInt() doesn't advance scanner to the next line - so nextLine() just 
		 * reads till the end of the current line.
		 */
		String s = scan.nextLine();
		System.out.print("Your number: " + x + "\n");
		System.out.print("Your string: " + s + "\n");
		scan.close();
	}

}
