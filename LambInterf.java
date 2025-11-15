// lambda interface
interface Greeting{
	void sayHello();
}

public class LambInterf {
	public static void main(String[] args){
		Greeting g = () -> System.out.println("Hello from lambda interface.");
		g.sayHello();
	}	
}
