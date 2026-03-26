import java.util.Scanner;

public class ScanE {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter username: ");

		String usrName = myObj.nextLine();
		System.out.println("User: " + usrName);
	}
}
