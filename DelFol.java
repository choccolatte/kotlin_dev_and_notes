import java.io.File;

public class DelFol {
	public static void main(String[] args){
		File myFol = new File("C:\\Users\\singh\\OneDrive\\Documents\\GitHub\\kot\\test");

		if (myFol.delete()){
			System.out.println("Folder deleted successfully: " + myFol);
		} else {
			System.out.println("Folder can't be deleted.");
		}
	}
}