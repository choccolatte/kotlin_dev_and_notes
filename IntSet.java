import java.util.HashSet;

public class IntSet {
	public static void main(String[] args){
		HashSet<Integer> myNum = new HashSet<Integer>();

		// adding element to set
		myNum.add(199);
		myNum.add(19);
		myNum.add(9);

		// looping through the set to find whether a num belongs in the set
		for (int i = 0; i < 20; i++){
			if (myNum.contains(i)){
				System.out.println(i + " was found in the Set.");
			} else {
				System.out.println(i + " was NOT found in the Set.");
			}
		} 
	}
}
