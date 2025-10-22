public class ThisCar{
	int modelYear;
	String modelName;

	// constructor with one parameter
	public ThisCar(String modelName){
		// call the two-parameter constructor to reuse code and set a default year
		this(2020, modelName);
	}

	// constructor with two parameters
	public ThisCar(int modelYear, String modelName){
		// use 'this' to assign values to the class variable
		this.modelYear = modelYear;
		this.modelName = modelName;
	}

	// method to print the car info
	public void printInfo(){
		System.out.println(modelYear + " " + modelName);
	}

	public static void main(String[] args){
		// create a car with only model name (uses default year)
		ThisCar car1 = new ThisCar("Corvette");

		// now, create a car with both mmodel year and name\
		ThisCar car2 = new ThisCar(2025, "Mustang GTD");

		car1.printInfo();
		car2.printInfo();
	}
}
