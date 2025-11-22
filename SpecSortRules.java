import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortEvenFirst implements Comparator{
	public int compare(Object obj1, Object obj2){
		// make sure the objects are integers
		Integer a = (Integer) obj1;
		Integer b = (Integer) obj2;

		// check each number to see if it is even
		// a number is even if the remainder when dividing  by 2 is 0
		boolean aIsEven = (a % 2) == 0;
		boolean bIsEven = (a % 2) == 0;

		if (aIsEven == bIsEven){
			// if both numbers are even or both are odd, then use normal sorting rules
			if (a < b) return -1;
			if (a > b) return 1;
			return 0;
		} else {
			// if a is even then it goes first, otherwise b goes first
			if (aIsEven){
				return -1;
			} else {
				return 1;
			}
		}
	}
}

public class SpecSortRules {
	public static void main(String[] args){
		ArrayList<Integer> myNum = new ArrayList<Integer>();
		myNum.add(33);
		myNum.add(332);
		myNum.add(333);
		myNum.add(3322);
		myNum.add(33121);
		myNum.add(312123);

		Comparator myComparator = new SortEvenFirst();
		Collections.sort(myNum, myComparator);

		for (int i : myNum){
			System.out.println(i);
		}
	}	
}
