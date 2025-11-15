interface StringFunc{
	String run(String str);
}
public class LambPara {
	public static void main(String[] args){
		StringFunc exclaim = (s) -> s + "!";
		StringFunc ask = (s) -> s + "?";
		printFormatted("Hello", exclaim);
		printFormatted("Hello", ask);
	}

	public static void printFormatted(String str, StringFunc format){
		String result = format.run(str);
		System.out.println(result);
	}
}
