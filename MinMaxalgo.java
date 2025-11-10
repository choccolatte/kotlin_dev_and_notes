import java.util.*;

public class MinMaxalgo {
	public static void main(String[] args){
		ArrayList<Integer> nums = new ArrayList<>();

		nums.add(1);
		nums.add(10);
		nums.add(0);
		nums.add(101);
		nums.add(12121);
		nums.add(1212131);

		Integer minNum = Collections.min(nums);
		Integer maxNum = Collections.max(nums);

		System.out.println("Min: " + minNum);
		System.out.println("Max: " + maxNum);

	}	
}
