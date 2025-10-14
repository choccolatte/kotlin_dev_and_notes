// an array storing diff ages
int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};

float avg, sum = 0;

// get the length of the array
int length = ages.length;

// loop through the elements of the array
for (int age : ages){
	sum += age[i];
}

// calclate the average by dividing the sum with the total length
avg = sum / length;

// print the avg
System.out.println("Averge age is: " + avg);