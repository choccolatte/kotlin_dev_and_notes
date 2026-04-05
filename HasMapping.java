import java.util.HashMap;

public class HasMapping {
	public static void main(String[] args){
		// create hashmap
		HashMap<String, String> carCars = new HashMap<String, String>();
		
		// cars and brands - key/value pair
		carCars.put("Ford", "GT");
		carCars.put("Toyota", "Supra");
		carCars.put("BMW", "X5");
		carCars.put("Audi", "RS7");
		carCars.put("Honda", "Civic");

		System.out.println(carCars);

		// iterating over HashMap
	}
}
