public class GenEx {
	// generic method: works with any type T
	public static <T> void printArray(T[] array){
		for (T item : array){
			System.out.println(item);
		}
	} 	

	public static void main(String[] args){
		// array of string
		String[] names = {"John", "Jenny", "Jill", "Joe"};

		// array of ints
		Integer[] nums = {1, 2, 3, 4};

		// calling the generic method with both arrays
		printArray(names);
		printArray(nums);
	}
}
