import java.util.*;
public class SwapElem {
	public static void main(String[] args){
		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Strawberry");
		fruits.add("Banana");
		fruits.add("Lichee");
		fruits.add("Pineapple");

		System.out.println(fruits);
		Collections.swap(fruits, 0, 4);
		System.out.println(fruits);
	}	
}
