package date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Format {

	public static void main(String[] args) {
         LocalDateTime dt=LocalDateTime.now();//create object dt
         System.out.println("Before formatting :"+dt);//display date and time before format
         DateTimeFormatter format=DateTimeFormatter.ofPattern("E, dd/MMM/yyyy");//create object for formatter
         String formatDate=dt.format(format);
         System.out.println("After formatting :"+formatDate);//display date and time after format
	}

}
