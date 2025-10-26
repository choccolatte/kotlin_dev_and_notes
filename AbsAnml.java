abstract class AbsAnml {
	public abstract void animalSound();
	
	public void sleep(){
		System.out.println("Zzzzzz");
	}
}

class Pig extends AbsAnml{
	public void animalSound(){
		System.out.println("Oink Oink mf!!!");
	}
}

class Cat extends AbsAnml{
	public void animalSound(){
		System.out.println("Mraaawww!!");
	}
}

class Main{
	public static void main(String[] args){
		// AbsAnml myAnml = new AbsAnml(); // creating animal obj
		Pig myPig = new Pig(); // creating pig obj
		Cat myCat = new Cat(); // creating cat obj

		// myAnml.animalSound();
		myPig.animalSound();
		myPig.sleep();
		myCat.animalSound();
		myCat.sleep();
	}
}
