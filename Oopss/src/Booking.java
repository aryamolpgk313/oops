package date_time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;

public class Booking {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Calendar c=Calendar.getInstance();
        System.out.println("Enter the name");
        String name=s.next();//get name of person
        System.out.println("Enter the Address");
        String addr=s.next();//get address
        System.out.println("Number of Rooms");
        int n=s.nextInt();//number of rooms needed
        System.out.println("Number of persons");
        int p=s.nextInt();//number of persons
        System.out.println("AC or Non-AC");
        String ac=s.next();//AC or non-AC room
        System.out.println("Booking date");
        String start =s.next();// format 2017-11-20
        System.out.println("Checkout Date ");
        String end = s.next();//// format 2017-11-20
        LocalDate ds = LocalDate.parse(start);
        LocalDate de = LocalDate.parse(end);
        long d = ChronoUnit.DAYS.between(ds,de);//find total days 
        double amount=0;double amount1=0;
        int n1=Math.round(p/2);	
        if(n1==n)
        {
        if(ac.contentEquals("AC")&(p%2!=0))	
        {
        	amount1=(1000+150)*d*n-1;
        	amount=amount1+(250*d);
        }
        else if(ac.contentEquals("AC")&(p%2==0))
        {
        	amount=(1000+150)*d*n;
        }
        else if(ac.contentEquals("Non-AC")&(p%2!=0))
        {
        	amount1=1000*d*n-1;
            amount=amount1+(250)*d;	
            
        }
        else if(ac.contentEquals("Non_AC")&(p%2==0))
        {
            amount=(1000)*d*n;	
        }
        System.out.println("Reg-Details.....");
        System.out.println("Name :"+name);
        System.out.println("Address :"+addr);
        System.out.println("No of rooms :"+n);
        System.out.println("No of guests :"+p);
        System.out.println("AC/Non_AC :"+ac);
        System.out.println("No of days :"+d);
        System.out.println("Amount :"+amount);
        }
        else
        {
        System.out.println("Book another room");	
        }
        }
	}
