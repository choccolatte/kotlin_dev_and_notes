int[] nums = {3, -1, 7, 0, 9};

for (int num : nums){
	if (num < 0){
		continue; // skips negative nums
	} 
	if (num == 0){
		break; // stops program if there's 0
	}

	System.out.println(num);
}