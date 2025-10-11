int age = 20;
boolean isCitizen = true;

if (age >= 18){
	System.out.println("Old enough to vote.");

	if (isCitizen){
		System.out.println("Is a citizen, can vote.");
	} else {
		System.out.println("Not a citizen. You must be a citizen to vote.");
	}
	else {
		System.out.println("Not old enough to vote.");
	}
}