int[] nums = {45, 12, 98, 33, 27};
int max = nums[0];
int min = nums[0];

for (int num : nums){
	if (num > max){
		max = num; // replaces higher num with max
	}
	if (num < min){
		min = num; // replaces lower num with min
	}
}

System.out.println("Highest number is: " + max);
System.out.println("Lowest number is: " + min);