import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// define a car class which ic comparable
class Car implements Comparable{
	public String brand;
	public String model;
	public int year;

	public Car(String b, String m, int y){
		brand = b;
		model = m;
		year = y;
	}

	// decide how this object compares to other objects
	public int compareTo(Object obj){
		Car other = (Car) obj;
		if (year < other.year) return -1; // this object is smaller than the other one
		if (year > other.year) return 1; // this object is bigger than the other one
		return 0; // both objects are the same
	}
}

public class CompInt {
	public static void main(String[] args){
		// create a list of cars
		ArrayList<Car> myCars = new ArrayList<Car>();
		myCars.add(new Car("BMW", "M2", 2025));
		myCars.add(new Car("Toyota", "Supra", 2024));
		myCars.add(new Car("Audi", "R8", 2025));

		// sort the cars
		Collections.sort(myCars);

		// display the cars
		for (Car c : myCars){
			System.out.println(c.brand + " " + c.model + " " + c.year);
		}
	}
}
