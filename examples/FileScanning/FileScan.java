import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileScan {

	public static void main(String[] args) {
		ArrayList<PersonIceCreamPair> pairs = new ArrayList<PersonIceCreamPair>();
		File inputFile = new File("favoriteicecream.txt");
	
		try {
			Scanner fileScan = new Scanner(inputFile);

			while (fileScan.hasNextLine()) {
				String line = fileScan.nextLine();
				Scanner lineScan = new Scanner(line);
				lineScan.useDelimiter(",");

				String person = lineScan.next();
				String iceCream = lineScan.next();
				lineScan.close();
				PersonIceCreamPair pair = new PersonIceCreamPair(person, iceCream);
				pairs.add(pair); // Save pair in list of pairs
			}
			System.out.println(pairs);
			fileScan.close();
		} catch (FileNotFoundException e) {
			System.out.println("File could not be found!!");
		}
		System.out.println("We didn't blow up!!");

	}

}
