import java.util.*;

public class Search {
	public static void main(String[] args){
		var names = new ArrayList<String>();

		names.add("John");
		names.add("Liam");
		names.add("Joe");

		Collections.sort(names); // must be sorted first to seach
		int index = Collections.binarySearch(names, "Jill");

		if(index == 0){
			System.out.println("Name found at: " +index);
		}
		else{
			System.out.println("Name not found.");
		}
	}
}
