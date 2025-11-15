import java.util.ArrayList;

public class Lamb {
	public static void main(String[] args){
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(1);
		nums.add(1110);
		nums.add(101);
		nums.add(10192);

		// looping using for each
		nums.forEach((n) -> {System.out.println(n); });
	}	
}
