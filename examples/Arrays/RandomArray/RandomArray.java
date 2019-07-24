import java.util.Random;

public class RandomArray {

	private int[] randomArray;
	
	public RandomArray(int size) {
		Random rand = new Random();
		
		randomArray = new int[size];
		
		for (int i = 0; i < size; i++) {
			randomArray[i] = rand.nextInt(100);
		}
	}
	
	public String toString() {
		String arrayStr = "";
		for (int i = 0; i < randomArray.length; i++) {
			arrayStr += "index: " + i + ", value: " + randomArray[i] + "\n";
		}
		return arrayStr;
	}
}
