import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// definign a car class
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

// creating a comparator
class AdvSort  implements Comparator{
	public int compare(Object obj1, Object obj2){
		// make sure the objects are Car objects
		Car a = (Car) obj1;
		Car b = (Car) obj2;

		// compare the year of both cars
		if(a.year < b.year) return -1; // first car is smaller than second
		if(a.year > b.year) return 1; // first car is greater than second
		return 0; // both cars have the same year
	}
}

public class Main{
	public static void main(String[] args){

		// create a list of cars
		ArrayList<Car> myCar = new ArrayList<Car>();
		myCar.add(new Car("BMW", "M8 Comp", 2026));
		myCar.add(new Car("Honda", "Civic", 2025));
		myCar.add(new Car("Toyota", "Supra", 2024));

		// use a comparator to sort the cars
		Comparator myComp = new AdvSort();
		Collections.sort(myCar, myComp);

		// display the cars
		for(Car c : myCar){
			System.out.println(c.brand + " " + c.model + " " + c.year);
		}

	}
}