public class Tryit {
	public static void main(String[] args){
		try{
			int[] myNum = {1, 2, 3, 4, 5};
			System.out.println(myNum[10]);
		} catch(Exception e){
			System.out.println("Something went wrong.!");
		}
	}
}
