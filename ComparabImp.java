class Car implements Comparable{
	public String brand;
	public String model;
	public int year;

	// decide how this object compares to other objects
	public int compareTo(Object obj){
		Car other= (Car)obj;
		if (year < other.year) return -1; // this object is smaller than the other one
		if (year > other.year) return 1; // this object is larger than the other one
		return 0;
	}
} 
// public class ComparabImp {
	
// }
