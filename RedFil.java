import java.io.FileInputStream;
import java.io.IOException;

public class RedFil {
	public static void main(String[] args){
		// using try-with-resources so file closes automatically
		try(FileInputStream myFilInput = new FileInputStream("filename.txt")){
			
			int i; // variable to store each byte that is read
			
			// read one byte at a time
			
			while((i = myFilInput.read()) != -1){
				System.out.println((char)i);
			}
		} catch(IOException e){
			System.out.println("Error occured while reading the file.");
			e.printStackTrace();
		}
	}
}