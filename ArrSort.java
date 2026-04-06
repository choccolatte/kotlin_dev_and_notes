import java.util.ArrayList;
import java.util.Collections;

public class ArrSort {
	public static void main(String[] args){
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Honda");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Toyota");

		// printing the list as is as a list
		System.out.println(cars);

		// sorting list
		Collections.sort(cars);
		for (String i : cars){
			System.out.println(i); // printing one at a time
		}
	}
}
