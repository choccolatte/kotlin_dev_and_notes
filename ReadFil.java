import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFil {
	public static void main(String[] args){
		File myObj = new File("filename.txt"); // opening the file

		// try-with-resources - so Scanner will be closed
		try(Scanner myRead = new Scanner(myObj)){
			while(myRead.hasNextLine()){
				String data = myRead.nextLine();
				System.out.println(data);
			}
		} catch(FileNotFoundException e){
			System.out.println("Error occured when opening the file.");
			e.printStackTrace();
		}
	}
}
