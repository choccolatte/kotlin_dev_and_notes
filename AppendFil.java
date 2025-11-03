import java.io.FileOutputStream;
import java.io.IOException;

public class AppendFil {
	public static void main(String[] args){
		String newTxt = "Hello World from new file.";

		// using try-with-resources to close automatically
		try(FileOutputStream myFil = new FileOutputStream("filename.txt", true)){
			myFil.write(newTxt.getBytes());
		}catch(IOException e){
			System.out.println("an error occured while appending the file");
			e.printStackTrace();
		}
	}
}
