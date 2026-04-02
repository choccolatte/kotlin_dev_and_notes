import java.io.FileWriter;
import java.io.IOException;

public class FileCreat {
	public static void main(String[] args){
		// using try-with-resources
		try(FileWriter myFil = new FileWriter("newFil.txt")){
			myFil.write("This is a dummy text file with dummy text values.");
			System.out.println("Successfully wrote to file.");
		}catch(IOException e){
			System.out.println("Error occured while writing to file.");
			e.getStackTrace();
		}
	}
}
