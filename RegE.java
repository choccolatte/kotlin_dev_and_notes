import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegE {
	public static void main(String[] args){
		Pattern myPat = Pattern.compile("world", Pattern.CASE_INSENSITIVE);
		Matcher myMat = myPat.matcher("Hello world!");

		boolean matchFound = myMat.find();

		if (matchFound){
			System.out.println("match found!");
		} else {
			System.out.println("match not found!");
		}
	}
}
