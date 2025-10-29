import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class DatFormat {
	public static void main(String[] args){
		LocalDateTime myLdt = LocalDateTime.now();
		System.out.println("Bfore formatting date: " + myLdt);

		DateTimeFormatter myFormattedObj = DateTimeFormatter.ofPattern(dd-mm-yyyy hh:mm:ss:ns);

		String formattedDate = myLdt.format(myFormattedObj);
		System.out.println("After formatting date: " + formattedDate);
	}	
}
