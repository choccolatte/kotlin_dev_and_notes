import java.util.*;

public class IterAlg {
	public static void main(String[] args){
		ArrayList<String> cols = new ArrayList<>();

		cols.add("Red");
		cols.add("Blue");
		cols.add("Green");
		cols.add("Black");
		cols.add("Yellow");

		for (String col : cols){
			System.out.println(col);
		}
		
		// looping using an iterator
		Iterator<String> iter = cols.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}
