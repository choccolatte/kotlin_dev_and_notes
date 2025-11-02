import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFil {
	public static void main(String[] args){
		try(FileInputStream filInput = new FileInputStream("bike.jpg");
		FileOutputStream filOutput = new FileOutputStream("bikeCopied.jpg")){
			int i; // where the copied data is kept

			while ((i = filInput.read()) != -1){
				filOutput.write(i);
			}

			System.out.println("File copied successfully.");
		} catch(IOException e){
			System.out.println("Error occured while handling the file.");
			e.printStackTrace();
		}
	}
}
