import java.util.ArrayList;
import java.util.Iterator;

public class IterCar {
	public static void main(String[] args){
		ArrayList<String> cars = new ArrayList<String>();

		cars.add("BMW");
		cars.add("Honda");
		cars.add("Volvo");
		cars.add("Mazda");
		cars.add("Toyota");

		// creating iterator
		Iterator<String> iter = cars.iterator();

		//printing first value
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}	
}
