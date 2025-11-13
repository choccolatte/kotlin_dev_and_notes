class Stats <T extends Numbers> {
	T[] nums;

	// constructor
	Stats(T[] nums){
		this.nums = nums;
	}

	// calculate things
	double average(){
		double sum = 0;
		for (T num : nums){
			sum += num.doubleValue();
		}
		return sum / nums.length;
	}
}

public class BoundGen {
	public static void main(String[] args){
		// use with int
		Integer[] intNums = {10, 20, 30, 40, 50};
		Stats<Integer> intStats = new Stats<>(intNums);
		System.out.println("Int average: " + intStats.average());

		// use with double
		Double[] doubleNums = {10.5, 20.5, 30.5, 40.5, 50.5};
		Stats<Double> doubleStats = new Stats<>(doubleNums);
		System.out.println("Double average: " + doubleStats.average());
	}
}
