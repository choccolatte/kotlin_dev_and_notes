import java.io.IOException;
import java.io.File;

public class CreateFil {
	public static void main(String[] args){
		try{
			File myFil = new File("filename.txt");
			if(myFil.createNewFile()){
				System.out.println("File created: " + myFil.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch(IOException e){
			System.out.println("Error occured when trying to create a new file.");
			e.printStackTrace(); // prints error details
		}
	}
}
