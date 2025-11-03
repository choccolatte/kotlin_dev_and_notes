import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppenToFil {
	public static void main(String[] args){
		try(BufferedWriter myFil = new BufferedWriter(new FileWriter("filename.txt", true))){
			myFil.newLine(); // for new line continuation
			myFil.write("Hello world after appending");
			System.out.println("Successfully appended to file.");
		}catch(IOException e){
			System.out.println("error occured while appending to file.");
			e.printStackTrace();
		}
	}
}
