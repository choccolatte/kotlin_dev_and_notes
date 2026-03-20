import java.time.Year;

public class Prac {
	// define a variable
	int currYear = 2026;
	// check if variable equals condition
	if (currYear == Year.now){
		System.out.println("Year: " + currYear);
		return 0;
	}
	System.out.println("Year: " + Year.now());
	return 1;
}