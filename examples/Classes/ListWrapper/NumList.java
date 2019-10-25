import java.util.ArrayList;

public class NumList implements NumListInterface {
	
	private ArrayList<Integer> numList = new ArrayList<Integer>();

	public void addNum(int num) {
		numList.add(num);
	}
	
	public String toString() {
		String list = "";
		for (Integer i: numList) {
			list += i + " ";
		}
		return list;
	}
}
