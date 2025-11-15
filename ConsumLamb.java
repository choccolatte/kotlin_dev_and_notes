import java.util.ArrayList;
import java.util.function.Consumer;;

public class ConsumLamb {
	public static void main(String[] args){
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(5);
		nums.add(50);
		nums.add(15);
		nums.add(25);
		nums.add(500);

		Consumer<Integer> method = (n) -> {System.out.println(n); };
		nums.forEach(method);
	}
}
