import java.io.File;

public class GetFileInf {
	public static void main(String[] args){
		File myFil = new File("filename.txt");

		if (myFil.exists()){
			System.out.println("File name: " + myFil.getName());
			System.out.println("Absolute path: " + myFil.getAbsolutePath());
			System.out.println("File size in bytes: " + myFil.length());
			System.out.println("File Writable: " + myFil.canWrite());
			System.out.println("File Readable: " + myFil.canRead());
		} else {
			System.out.println("Can't locate file.");
		}
	}
}
