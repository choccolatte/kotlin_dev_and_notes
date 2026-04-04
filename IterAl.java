import java.util.ArrayList;
import java.util.Iterator;

public class IterAl {
	public static void main(String[] args){
		// create an arraylist of strings
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("BMW");
		alist.add("Volvo");
		alist.add("Honda");
		alist.add("Toyota");
		alist.add("Ford");

		// get an iterator for the ArrayList
		Iterator<String> iter = alist.iterator();

		// iterate through the list using the iterator
		while(iter.hasNext()){
			System.out.println(iter.next()); // use next() here else it will turn into a forever loop
		}
	}
	
}