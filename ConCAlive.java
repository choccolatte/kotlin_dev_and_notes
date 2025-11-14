public class ConCAlive extends Thread{
	public static int amount = 500;

	public static void main(String[] args){
		ConCAlive thread = new ConCAlive();
		thread.start();
		
		// wait for the thread to finish
		while(thread.isAlive()){
			System.out.println("Waiting...");
		}

		// update amount and print its new value
		System.out.println(amount);
		amount++;
		System.out.println(amount);
	}
	
	public void run(){
		amount++;
	}
}
