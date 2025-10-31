public class ManyErrHandling {
	public static void main(String[] args){
		try{
			int[] numbers = {1, 2, 3, 4, 5};
			System.out.println(numbers[10]); // ArrayIndexOutOfBoundsException
			int result = 10 / 0; // ArithmeticException
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Array index does not index");
		} catch(ArithmeticException e){
			System.out.println("Cannot divide by zero.");
		} catch(Exception e){
			System.out.println("Something else went wrong. Try again later.");
		}
	}
}
