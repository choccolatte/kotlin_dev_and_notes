public class Paramethods {
	static void myMethod(String fname, int age){
		System.out.println(fname + "Smith is " + age);
	}

	public static void main(String[] args){
		myMethod("Joe", 18);
		myMethod("John", 50);
		myMethod("Liam", 22);
	}

// outputs -
// Joe Smith
// John Smith
// Liam Smith
	
}
