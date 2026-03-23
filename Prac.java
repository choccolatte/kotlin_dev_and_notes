// import java.time.Year;

public class Prac {
	// define a variable
	// int currYear = 2026;

	// // check if variable equals condition
	// if (currYear == Year.now){
	// 	System.out.println("Year: " + currYear);
	// 	// return 0;
	// }
	// System.out.println("Year: " + Year.now());
	// return 1;

	// lowest and highest in an int array
	// int[] nums = {45, 12, 98, 33, 27, 9, 100, 23, 34, 45, 56, 65, 76, 87, 98, 11};

	// int minx = nums[0];
	// int maxx = nums[0];

	// for(int num : nums){
	// 	// highest
	// 	if(mmaxx < num){
	// 		maxx = num;
	// 	}

	// 	// lowest
	// 	if(num < minx){
	// 		minx = num;
	// 	}
	// }

	// System.out.println("Highest number: " + maxx);
	// System.out.println("Lowest number: " + minx);

	// recursion
	public static int sum(int k){
		if (k > 0){
			return k + sum(k -1);
		} else {
			return 0;
		}
	}

	public static void main(String[] args){
		int res = sum(10);
		System.out.println(res);
	}
}