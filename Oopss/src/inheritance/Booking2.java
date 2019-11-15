package inheritance;

import java.util.Scanner;

public class Booking2 {

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
        System.out.println("Booking");
        System.out.println("Enter the no of persons");
		int person=s.nextInt();
		System.out.println("Enter the no of days");
		int days=s.nextInt();
		System.out.println("Enter the room type(AC/Non-AC)");
		String ac=s.next();
		System.out.println("Enter the month");
		int m=s.nextInt();
		System.out.println("Enter the tariff for one person");
        int tariff=s.nextInt();
        Peakseason pe=new Peakseason();
		Leanseason le=new Leanseason();
		switch(m)
		{
		case 4:
		case 5:
		case 6:
		case 9:
		case 11:
		case 12:
			System.out.println("Enter the peak charge");
			int p=s.nextInt();
			pe.peak(person,days,tariff,m,p);
			break;
		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 10:
			System.out.println("Enter the discount");
			int d=s.nextInt();
			le.lean(person,days,tariff, m,d);
			break;
		}    
	}
}
class Bookingroom{
	void book() {
		
	}
}
class Peakseason extends Bookingroom
{
	Scanner s=new Scanner(System.in);
	void peak(int persons,int days,int tariff,int m,int p)
	{
		
		     int total=persons*days*tariff*p;
		     System.out.println("Total tariff:"+total+"/-");
		}
		
	}

class Leanseason extends Bookingroom{
	Scanner s=new Scanner(System.in);

	void lean(int persons,int days,int tariff,int m,int d) 
	{
	
		    int tot=persons*days*tariff;
		    	int total=tot-(tot*25)/100;
		    System.out.println("Total tariff:"+total+"/-");
	    }
}




