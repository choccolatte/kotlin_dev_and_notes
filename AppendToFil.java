import java.io.FileWriter;
import java.io.IOException;

public class AppendToFil {
	public static void main(String[] args){
		// true = append is on
		try(FileWriter myFil = new FileWriter("filename.txt", true)){
			myFil.write("\nHello World after Appending new text file.");
			System.out.println("File appended successfully.");
		} catch(IOException e){
			System.out.println("An error occured when appending the file.");
		}
	}
}
