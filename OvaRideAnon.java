class Animal{
	void makeSound(){
		System.out.println("Animal makes a sound.");
	}
}

class Dog extends Animal{
	@Override
	void makeSound(){
		System.out.println("Woof!");
	}
}

public class OvaRideAnon {
	public static void main(String[] args){
		Animal myDog = new Dog();
		myDog.makeSound();
	}
}
