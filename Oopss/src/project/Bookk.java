package project;

import java.util.Scanner;

public class Bookk {
	public static void main(String[] args) {
	
	bokking bo=new bokking();
	bo.reg();
}
}
 class bokking{   
	 
	public void reg() {
		int i=1;
		String[]c=new String[25];
		String[]e=new String[25];
		String[]cid=new String[25];
		Scanner s=new Scanner(System.in);
		System.out.println("Registration\n\n");
		System.out.println("Enter your name");
	     c[i]=s.next();
	     i++;
		System.out.println("Enter your address");
		String addr=s.next();
		System.out.println("Enter your phone no");
		String ph=s.next();
		System.out.println("Enter your Email id");
		e[i]=s.next();
		i++;
		System.out.println("Enter proof type");
		String pid=s.next();
		System.out.println("Enter proof id ");
		String id=s.next();
		
		System.out.printf("Thank you for registering.\n Your id is "+i);
		System.out.println("\nDo you want to book a room?");
		String no=s.next();
		if(no.contentEquals("y")==true) 
		{
			
			book();	
		}
		else {
			reg();
		}
		i++;
		System.out.println("Do you want to continue registration?");
		String re=s.next();
		if(re.contentEquals("y")==true);
		{
			System.out.println("Customerid    Name     Email");
			for(int k=1;k<=i;k++) {
				System.out.println(k+"   "+c[k]+"   "+e[k]);
				
			}
		}
	}
		private static void book() {
		 int booked[]=new int[25];
			String ac,cot,cable,wifi,laundry,proceed;
			int total,b=0,c,d,e,f;
			Scanner s=new Scanner(System.in);
	System.out.println("Booking");
	System.out.println("Plz choose the service request");
	System.out.println("AC/non-AC(AC/nAC)");
	ac=s.next();
	if(ac.equals("AC"))
	{
	b=1000;
	}
	else
	{
	b=750;
	}

	System.out.println("Cot(Single/Double)");
	cot=s.next();
	if(cot.equals("Single"))
	{
	c=0;
	}
	else
	{
	c=350;
	}
	System.out.println("With cable connection/without cable connection(C/nC)");
	cable=s.next();
	if(cable.equals("W"))
	{
	d=50;
	}
	else
	{
	d=0;
	}
	System.out.println("Wi-Fi needed or not(W/nW)");
	wifi=s.next();
	if(wifi.equals("W"))
	{
	e=200;
	}
	else
	{
	e=0;
	}
	System.out.println("Laundry service needed or not(L/nL)");
	laundry=s.next();
	if(laundry.equals("L"))
	{
	f=100;
	}
	else
	{
	f=0;
	}

	total=b+c+d+e+f;
	System.out.println(ac+"room");
	System.out.println("The total charge is Rs."+total);
	System.out.println("The services chosen are");
	 
	if(c==0)
	{
	System.out.println("Single cot");
	}
	else
	{
	System.out.println("Double cot");
	}
	if(d==50)
	{
	System.out.println("Cable connection enabled");
	}
	else
	{
	System.out.println("Cable connection not enabled");
	}
	if(e==200)
	{
	System.out.println("WiFi enabled");
	}
	else
	{
	System.out.println("WiFi not enabled");
	}
	if(f==100)
	{
	System.out.println("with laundry service");
	}
	else
	{
	System.out.println("No laundry service");
	}
	System.out.println("Do you want to proceed(y/n)");
	 proceed=s.next();
	 int j=1;
	if(proceed.equals("y"))
	{
	System.out.println("Thank you for booking your room number is "+j);
	j++;
   
	}
	}
}
