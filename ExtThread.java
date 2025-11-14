public class ExtThread extends Thread {

	public static void main(String[] args){
		ExtThread thread = new ExtThread();
		thread.start();
		System.out.println("This code is running outside the thread.");
	}
	
	public void run(){
		System.out.println("This code is running in a Thread.");
	}
}
