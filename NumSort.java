import java.util.ArrayList;
import java.util.Collections;

public class NumSort {
	public static void main(String[] args){
		ArrayList<Integer> myNum = new ArrayList<Integer>();
		myNum.add(12);
		myNum.add(1);
		myNum.add(0);
		myNum.add(90);
		myNum.add(67);

		// sorting
		Collections.sort(myNum);
		
		// looping
		for(int i : myNum){
			System.out.println(i);
		} 
	}
}
