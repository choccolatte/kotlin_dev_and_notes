import java.util.HashMap;

public class NewHMap {
	public static void main(String[] args){
		// creating new HashMap obj
		HashMap<String, String> nam = new HashMap<String, String>();

		// adding items - key/value pairs
		nam.put("John", "Smith");
		nam.put("Joe", "Violet");
		nam.put("Alex", "Kyle");

		// looping through items
		for (String fName : nam.keySet()){
			System.out.println("First Name: " + fName + ", Last Name: " + nam.get(fName));
		}
	}	
}
