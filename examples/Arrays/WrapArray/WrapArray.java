
public class WrapArray {

	private int[] wrapArray = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
	private int nextIndex = 0;
	
	public int draw() {
		if (nextIndex == wrapArray.length) {
			return -1;
		}
		int retVal = wrapArray[nextIndex];
		nextIndex++;
		return retVal;
	}
	
}
