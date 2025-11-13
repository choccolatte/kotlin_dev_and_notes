public class Deprecatmethod {
	@Deprecated
	static void oldMethod(){
		System.out.println("This method is now deprecated");
	}

	public static void main(String[] args){
		oldMethod();
	}
}
