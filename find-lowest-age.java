// an array storing diff ages
int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};

// get the length of the array
int length = ages.length;

// create a 'lowest age' variable and assign the first array element of ages to it
int lowestAge = ages[0];

// loop through teh elements of the ages array to find the lowest age
for (int age : ages){
	// check if lowestage is high/low than current age
	if (age[i] < lowestAge){
		// if it is, replace current age with lowest age
		lowestAge = age[i];
	}
}

// output the lowest age
System.out.println("Lowest age in the array is: " + lowestAge);