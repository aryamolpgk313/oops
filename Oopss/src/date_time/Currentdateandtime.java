package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Currentdateandtime {

	public static void main(String[] args) {
		System.out.println("Today's date");
		LocalDate date=LocalDate.now();//create object date
		System.out.println(date);//display current date
		System.out.println("Current time");
		LocalTime time=LocalTime.now();//create object time
		System.out.println(time);//display current time
		System.out.println("Current date and time");
		LocalDateTime dt=LocalDateTime.now();//Create object dt
		System.out.println(dt);
	}

}
