import java.util.*;

public class FreqElem {
	public static void main(String[] args){
		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Pineapple");

		Integer freqApp = Collections.frequency(fruits, "Apple");
		System.out.println("Apple appears " + freqApp + " times in the 'Fruits' array.");
	}	
}
