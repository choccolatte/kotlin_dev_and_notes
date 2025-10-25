public class Anml {
	public void animalSound(){
		System.out.println("The animal makes a sound.");
	}
}

class Pig extends Anml{
	public void animalSound(){
		System.out.println("Oink Oink mf!!!");
	}
}

class Cat extends Anml{
	public void animalSound(){
		System.out.println("Mraaawww!!");
	}
}

class Main{
	public static void main(String[] args){
		Anml myAnml = new Anml(); // creating animal obj
		Pig myPig = new Pig(); // creating pig obj
		Cat myCat = new Cat(); // creating cat obj

		myAnml.animalSound();
		myPig.animalSound();
		myCat.animalSound();
	}
}
