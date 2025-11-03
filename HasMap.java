import java.util.HashMap;

public class HasMap {
	public static void main(String[] args){
		//create a HashMap obj
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("India", "Delhi");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("Australia", "Sydney");
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");

		System.out.println(capitalCities);
		System.out.println(capitalCities.get("Norway"));
	}
}