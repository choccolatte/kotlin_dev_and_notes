public class Thriw {
	static void checkAge(int age){
		if (age < 18){
			throw new ArithmeticException ("Access Denied. You aren't old enough.");
		} else {
			System.out.println("Access Graned. You can vote.");
		}
	}

	public static void main(String[] args){
		checkAge(15);
	} 
}
