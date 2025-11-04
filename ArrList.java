import java.util.ArrayList;
import java.util.Collections;

public class ArrList {
	public static void main(String[] args){
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Toyota");
		cars.add("Audi");
		// System.out.println(cars);

		// looping through the list using for loop
		// for (int i = 0; i < cars.size(); i++){
		// 	System.out.println(cars.get(i));
		// }

		// sorting the array using sort() method
		Collections.sort(cars);
		
		// looping through the list using for loop
		for (String i : cars){
			System.out.println(i);
		}
	}
}