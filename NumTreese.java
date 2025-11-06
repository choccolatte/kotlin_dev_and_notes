import java.util.TreeSet;

public class NumTreese {
	public static void main(String[] args){
		TreeSet<Integer> nums = new TreeSet<>();

		nums.add(100);
		nums.add(10);
		nums.add(10000);
		nums.add(9);
		nums.add(9919);

		// looping through
		for (int n : nums){
			System.out.println(n);
		}
	}
	
}
