public class Constructo {
	int x;

	// class conostructor
	public Constructo(){
		x = 500; //setting the initial value of x
	}
	
	public static void main(String[] args){
		Constructo myObj = new Constructo();
		System.out.println(myObj.x);
	}
}
