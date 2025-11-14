public class ConCExt extends Thread {
	public static int amount = 500;

	public static void main(String[] args){
		ConCExt thread = new ConCExt();
		thread.start();
		System.out.println(amount);
		amount++;
		System.out.println(amount);
	}

	public void run(){
		amount++;
	}
}
