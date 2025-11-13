// create a box class
class Box<T>{
	T value; // T here is a placeholder for any data type

	void set(T value){
		this.value = value;
	}

	T get(){
		return value;
	}
}

public class GenClas {
	public static void main(String[] args){
		// create a Box to hold a String
		Box<String> strBox = new Box<>();
		strBox.set("Hello World");
		System.out.println("Value: " + strBox.get());

		// create a Box to hold an Int
		Box<Integer> intBox = new Box<>();
		intBox.set(500);
		System.out.println("Value: " + intBox.get());
	}
}