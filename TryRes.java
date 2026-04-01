import java.io.FileOutputStream;
import java.io.IOException;

public class TryRes {
	public static void main(String[] args){
		// resource is opened inside try itself
		try(FileOutputStream output = new FileOutputStream("filename.txt")){
			output.write("Hello World".getBytes());
		} catch (IOException e) {
			System.out.println("Error writing file.");
		}
	}
}
