import java.util.LinkedHashMap;

public class LinkedHMapdata {
	public static void main(String[] args){
		LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();
		
		capitalCities.put("India", "Delhi");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		capitalCities.put("England", "London");
		capitalCities.put("USA", "Washington DC");

		// looping through key/value pairs
		for (String key : capitalCities.keySet()){
			System.out.println("Country: " + key + ", Capital: " + capitalCities.get(key));
		}
	}             
}
