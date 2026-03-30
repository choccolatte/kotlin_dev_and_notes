import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetDate {
	public static void main(String[] args){
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before time formatting: " + myDateObj);

		DateTimeFormatter myFormattedDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss:ns");

		String formattedDate = myDateObj.format(myFormattedDate);
		System.out.println("After time formatting: " + formattedDate);
	}
}
