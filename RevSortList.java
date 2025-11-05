import java.util.ArrayList;
import java.util.Collections;


public class RevSortList {
	public static void main(String[] args){
		ArrayList<String> carNew = new ArrayList<String>();
		carNew.add("Volvo");
		carNew.add("Toyota");
		carNew.add("Honda");
		carNew.add("Audi");
		carNew.add("Ford");

		Collections.sort(carNew, Collections.reverseOrder());

		for (String i : carNew){
			System.out.println(i);
		}
	}	
}
