import java.util.*;

public class SortinAlgo {
	public static void main(String[] args){
		// make list
		ArrayList<String> names = new ArrayList<>();

		// add items
		names.add("James");
		names.add("Jack");
		names.add("Jill");
		names.add("Joe");
		names.add("John");

		// sort list
		Collections.sort(names);

		// search using binarysearch
		int indeItem = Collections.binarySearch(names, "Jill");

		// print result at index
		System.out.println("Jill found at index: " + indeItem);
	}	
}
