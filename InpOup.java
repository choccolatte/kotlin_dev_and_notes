import java.util.Scanner;

public class InpOup {
	class Main{
		public static void main(String[] args){
			Scanner myObj = new Scanner(System.in);
			System.out.println("Enter username and age: ");

			String uName = myObj.nextLine(); // reads user input
			int uAge = myObj.nextInt();
			System.out.println("Username is: " + uName);
			System.out.println(uName + " is " + uAge + "years old.");
		}
	}
}
