package date_time;
import java.util.Calendar;
public class Calender {

	public static void main(String[] args) 
	{
      Calendar c=Calendar.getInstance();
      System.out.println("At present calender year :"+c.get(Calendar.YEAR));//display current year
      System.out.println("At present calender day :"+c.get(Calendar.DATE));//display current date
      System.out.println("Current time is :"+c.getTime());//display current time
      c.add(Calendar.DATE, -7);//time before 7 days
      System.out.println("7 days ago: " + c.getTime());
      c.add(Calendar.MONTH, 10);//time after 10 months
      System.out.println("10 months later: " + c.getTime());
      c.add(Calendar.YEAR, 10);//time after 10 years
      System.out.println("10 years later: " + c.getTime());
	}
}
