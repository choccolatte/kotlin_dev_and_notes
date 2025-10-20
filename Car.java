// creating a car class
public class Car {
	// creating a fullThrottle method
	public void fullThrottle(){
		System.out.println("Car is going fast as f*ck!!!");
	}

	// creating a speed() method and adding a parameter
	public void speed(int maxSpeed){
		System.out.println("Max speed: " + maxSpeed);
	}

	// inside main, call the methods on the myCar object
	public static void main(String[] args){
		Car myCar = new Car(); // creating a myCar object
		myCar.fullThrottle(); // calling the fullTHrottle method
		myCar.speed(150); // calling the speed method
	}
}

