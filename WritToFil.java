import java.io.FileOutputStream;
import java.io.IOException;

public class WritToFil {
	public static void main(String[] args){
		String newText = "This is the text we want to write in our file.";

		// try-with-resource
		try(FileOutputStream filOutput = new FileOutputStream("filename.txt")){
			filOutput.write(newText.getBytes());
			System.out.println("Written successfully.");
		} catch(IOException e){
			System.out.println("An error occured while writing to file.");
			e.printStackTrace();
		}
	}
}
