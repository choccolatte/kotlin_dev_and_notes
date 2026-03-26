public class Prac {
	int modelYear;
	String modelName;

	// co=nstructor with one parameter
	public Prac(String modelName){
		this(2025, modelName);
	}

	// co=nstructor with two parameters
	public Prac(int modelYear, String modelName){
		this.modelName = modelName;
		this.modelYear = modelYear;
	}

	// merthod to print car info
	public void printInfo(){
		System.out.println(modelYear + " " + modelName);
	}

	// main func
	public static void main(String[] args){
		// car with one para
		Prac myCar = new Prac("Mustang");

		// car with 2 paras
		Prac myCar2 = new Prac(2026, "Corvette");

		myCar.printInfo();
		myCar2.printInfo();
	}	
}