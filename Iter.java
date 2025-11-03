import java.util.ArrayList;
import java.util.Iterator;

public class Iter {
	public static void main(String[] args){
		// creating ArrayList with few elements to iterate
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Volvo");
		cars.add("Toyota");
		cars.add("Ford");

		// create an iterator for the ArrayList
		Iterator<String> iter = cars.iterator();

		// iterate through the ArrayList
		while (iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}
