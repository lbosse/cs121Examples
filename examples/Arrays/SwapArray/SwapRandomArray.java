import java.util.Random;

public class SwapRandomArray {

	private int[] randomArray;

	public SwapRandomArray(int size) {
		Random rand = new Random();

		randomArray = new int[size];

		for (int i = 0; i < size; i++) {
			randomArray[i] = rand.nextInt(100);
		}
	}

	public void swap(int i, int j) {
		int tmp = randomArray[i];
		randomArray[i] = randomArray[j];
		randomArray[j] = randomArray[tmp];
	}

	public String toString() {
		String arrayStr = "";
		for (int i = 0; i < randomArray.length; i++) {
			arrayStr += "index: " + i + ", value: " + randomArray[i] + "\n";
		}
		return arrayStr;
	}
}
