import java.util.HashSet;

public class HasSet {
	public static void main(String[] args){
		HashSet<String> carSet = new HashSet<String>();
		carSet.add("BMW");
		carSet.add("Ford");
		carSet.add("Toyota");
		carSet.add("Ferrari");
		carSet.add("Audi");
		carSet.add("BMW"); // duplicate
		System.out.println(carSet);
	}
}