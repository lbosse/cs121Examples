import java.util.ArrayList;
import java.util.Iterator;

public class Example {

	public static void main(String[] args) {
		ArrayList<String> genres = new ArrayList<String>();
		genres.add("Country");
		genres.add("punk");
		genres.add("reggae");
		genres.add("Rock");
		
		Iterator<String> i = genres.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
