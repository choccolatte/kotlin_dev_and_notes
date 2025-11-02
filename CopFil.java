import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopFil {
	public static void main(String[] args){
		try(FileInputStream myInp = new FileInputStream("bikeCopied.jpg");
		FileOutputStream myOut = new FileOutputStream("newCopy.jpg")){
			int b;

			while((b = myInp.read()) != -1){
				myOut.write(b);
			}System.out.println("File copied successfully;");
		}catch(IOException e){
			System.out.println("error occured while reading the file.");
			e.printStackTrace();
		}
	}
}
