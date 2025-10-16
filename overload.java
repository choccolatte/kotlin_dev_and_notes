public class overload-method {
	static int plusMethod(int x, int y){
		return x + y;
	}
	
	static double plusMethod (double x, double y){
		return x + y
	}
	
	public static void main(String[] args){
		int myNum1 = plusMethodInt(8, 5);
		double myNum2 = plusMethodDouble(80.12, 50.5);
	
		System.out.println("Int's value: " + myNum1);
		System.out.println("Double's value: " + myNum2);
	}	
}
