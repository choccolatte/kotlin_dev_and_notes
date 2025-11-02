import java.io.File;

public class DelFil {
	public static void main(String[] args){
		File myFil = new File("filename.txt");

		if (myFil.delete()){
			System.out.print("File deleted successfully: " +myFil);
		} else {
			System.out.println("Failed to delete file.");
		}
	}
}
