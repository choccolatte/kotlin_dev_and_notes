// functional interfaces
interface Greeting{
	void sayHello();
}

public class AnonCls {
	public static void main(String[] args){
		Greeting g= new Greeting() {
			public void sayHello(){
				System.out.println("Hello from anon class.");
			}
		};

		g.sayHello();
	}	
}
