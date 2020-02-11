import java.util.Random;

/**
 * 
 * @author lukebosse
 *
 */
public class MathAndRandom {

	public static void main(String[] args) {
		Random rand = new Random();
		
		// Randomly generate a number from 1 to 100
		System.out.println(rand.nextInt(100) + 1);
		
		// Randomly generate a number from -10 to 0
		System.out.println(0 - rand.nextInt(11));
		
		// Print out the exponent 2^3
		System.out.println(Math.pow(2, 3));
		
		// Print out a random number between 0 and 1.0
		System.out.println(Math.random());
		
		// Print out a random number between 1 and 100
		System.out.println((int)(Math.random() * 100 + 1));

	}

}
