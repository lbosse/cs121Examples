import java.util.ArrayList;

public class NestedForLoops {

	public static void main(String[] args) {
		final int MAX_ROWS = 5;

		for(int row = 0; row < MAX_ROWS; row++) {
		    for(int col = 0; col < MAX_ROWS; col++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
	}

}
