public class Countdown{
	static void countdown(int n){
		if (n > 0){
			System.out.println(n + " ");
			countdown(n - 1); // calling countdown again
		}
	}

	public static void main(String[] args){
		countdown(5);
	}
}