import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritToFilUsingBfwriter {
	public static void main(String[] args){
		try(BufferedWriter myFil = new BufferedWriter(new FileWriter("filename.txt"))){
			myFil.write("Line 1 - Hello World.");
			myFil.newLine();
			myFil.write("Line 2 - Hello Universe.");
			myFil.newLine();
			myFil.write("Line 3 - Hello Earth.");
			myFil.newLine();
			System.out.println("Successfully wrote to file.");
		} catch(IOException e){
			System.out.println("error occured while writing to file.");
			e.printStackTrace()
		}
	}
}
