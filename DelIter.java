import java.util.ArrayList;
import java.util.Iterator;

public class DelIter {
	public static void main(String[] args){
		// arraylist
		ArrayList<Integer> nums = new ArrayList<Integer>();

		// add items
		nums.add(1);
		nums.add(10);
		nums.add(100);
		nums.add(1000);
		nums.add(10000);

		// iterate
		Iterator<Integer> delNum = nums.iterator();

		// check whether items in collection
		while (delNum.hasNext()){
			Integer i = delNum.next();

			// remove items
			if (i < 10){
				delNum.remove();
			}
		}
		
		System.out.println(nums);
	}
}
