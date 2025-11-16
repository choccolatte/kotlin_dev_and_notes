import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// define a car class
class Car{
	public String brand;
	public String model;
	public int year;

	public Car(String b, String m, int y){
		brand = b;
		model = m;
		year = y;
	}
}

// create the comparator
class SortCarByYear implements Comparator{
	public int compare(Object obj1, Object obj2){
		// ensure that the objects are Car objects
		Car a = (Car) obj1;
		Car b = (Car) obj2;

		// compare the year of both objects
		if (a.year < b.year) return -1; // since the first car has lesser year 
		if (a.year > b.year) return 1; // since the first car has greater year 
		return 0; // if both cars have the smae year
	}
}

public class Comparato {
	public static void main(String[] args){
		// create a list of cars
		ArrayList<Car> myCar = new ArrayList<Car>();
		myCar.add(new Car("Honda", "NSX", 2025));
		myCar.add(new Car("Ford", "GTD", 2026));
		myCar.add(new Car("Toyota", "Supra", 2024));

		// use a comparator to sort the cars
		Comparator myComparator = new SortCarByYear();
		Collections.sort(myCar, myComparator);

		// display the cars
		for (Car c : myCar){
			System.out.println(c.brand + " " + c.model + " " + c.year);
		}
	}	
}