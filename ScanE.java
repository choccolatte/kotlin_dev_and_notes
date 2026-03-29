// interfaces
interface ScaneAni {
	public void animalSound();
	public void sleep();
}

// implementing animal interface
public class ScanE implements ScaneAni{
	public void animalSound(){
		System.out.println("Merrrw");
	}

	public void sleep(){
		System.out.println("Zzzz");
	}
}

class Main{
	public static void main(String[] args){
		
	}
}
