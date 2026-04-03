import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOStr {
	public static void main(String[] args){
		try(BufferedWriter inp = new BufferedWriter(new FileWriter("newFil.txt", true))){
			inp.newLine();
			inp.write("This is the appended line.");
			inp.newLine();
			System.out.println("File appended successfully.");
		}catch(IOException e){
			System.out.println("Error occured while appending file.");
			e.printStackTrace();
		}
	}
}

