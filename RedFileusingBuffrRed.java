import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RedFileusingBuffrRed {
	public static void main(String[] args){
		try(BufferedReader myFil = new BufferedReader(new FileReader("filename.txt"))){
			String newline;

			while ((newline = myFil.readLine()) != null) {
				System.out.println(newline);
			}
		}catch(IOException e){
			System.out.println("error occured.");
			e.printStackTrace();
		}
	}
}
