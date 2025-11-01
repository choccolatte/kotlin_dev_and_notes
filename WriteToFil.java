import java.io.FileWriter;
import java.io.IOException;

public class WriteToFil {
	public static void main(String[] args){
		try(FileWriter myFil = new FileWriter("filename.txt")){
			myFil.append("Hello World from try with resources!");
			System.out.println("File appended/written successfully.");
		} catch(IOException e){
			System.out.println("An error occured!");
			e.printStackTrace();
		}
		// try{
		// 	FileWriter myFil = new FileWriter("filename.txt");
		// 	myFil.write("Hello World!");
		// 	myFil.close();
		// 	System.out.println("Successfully written to file.");
		// } catch(IOException e){
		// 	System.out.println("Unexpected error occured.");
		// }
	} 
}
