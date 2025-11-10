import java.util.*;

public class SortAlg {
	public static void main(String[] args){
		ArrayList<Integer> nums = new ArrayList<>();

		nums.add(1);
		nums.add(10);
		nums.add(100);
		nums.add(1989);
		nums.add(19898);

		Collections.sort(nums);
		System.out.println(nums);

		// reversing the order
		Collections.sort(nums, Collections.reverseOrder());
		System.out.println(nums);
	}
}
