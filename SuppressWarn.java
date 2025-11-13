import java.util.ArrayList;

public class SuppressWarn {
	@SuppressWarnings("unchecked")

	public static void main(String[] args){
		ArrayList cars = new ArrayList<>();
		cars.add("Honda");
		System.out.println(cars);
	}
}
