package inheritance;

import java.util.Scanner;

public class Bookng {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String ac,pr,y;
		String cot;
		String cable;
		String wifi;
		String laundry;
		String [] p=new String[25];
		String [] em=new String[25];
		Scanner sc=new Scanner(System.in);
		int total=0,b=0,c,d,e,f,i=1;
		String re;
		do
		{
		System.out.println("Registration:");
		System.out.println("Enter your name:");
		p[i]=sc.next();
		System.out.println("Enter your address:");
		String adrs=sc.next();
		System.out.println("Enter your contact number:");
		int con_num=sc.nextInt();
		System.out.println("Enter your email id:");
		em[i]=sc.next();
		System.out.println("Enter your proof type:");
		String proof_typ=sc.next();
		System.out.println("Enter your proof number:");
		int proof_num=sc.nextInt();
		System.out.println("Thank you for registration.Your id is " +i+ "......");
		System.out.println("Do you want to book a room (y/n)?");
		y=sc.next();
		if(y.equals("y")==true)
		{
		booking();
		}

		i++;
		System.out.println("Do you want registration (y/n)?");
		y=sc.next();

		}
		while(y.equals("y")==true);{
		System.out.println("Customer ID  Customer Name  Email");
		for(int k=1;k<=i;k++)
		{
		System.out.println(k+"  "+p[k]+"   "+em[k]);}
		}
		}
		private static  void booking() {
		String ac,y,pr;
		String cot;
		String cable;
		String wifi;
		String laundry;
		Scanner sc=new Scanner(System.in);
		int total=0,b=0,c,d,e,f,i=1;
		String [] p=new String[25];
		String [] em=new String[25];
		do {
		System.out.println("Booking");
		System.out.println("please choose services");
		System.out.println("AC/Non AC");
		ac=sc.next();
		if(ac.contentEquals("AC")==true)
		{
		b=1500;
		}
		else
		{
		b=700;
		}
		System.out.println("Cot(Single/Double)");
		cot=sc.next();
		if(cot.equals("Single")==true)
		{
		c=50;
		}
		else
		{
		c=100;
		}
		System.out.println("With cable connection/without cable connection(C/nC)");
		cable=sc.next();
		if(cable.equals("C")==true)
		{
		d=50;
		}
		else
		{
		d=0;
		}
		System.out.println("Wi-Fi needed or not(W/nW)");
		wifi=sc.next();
		if(wifi.equals("W")==true)
		{
		e=200;
		}
		else
		{
		e=0;
		}
		System.out.println("Laundry service needed or not(L/nL)");
		laundry=sc.next();
		if(laundry.equals("L")==true)
		{
		f=100;
		}
		else
		{
		f=0;
		}
		//System.out.println("Enter the date of booking");
		//int o=sc.nextInt();
		System.out.println("Do you want to proceed(yes/no)");
		pr=sc.next();
		double[] book = new double[20];
		if(pr.contentEquals("yes")==true)
		{

		book[i]=1;
		System.out.println("Thank you your room number is"+i);
		i=i+1;
		}
		if(pr.equals("no")==true)
		{
		booking();
		}
		total=b+c+d+e+f;
		System.out.println("The total charge is"+total);



		System.out.println("The services chosen are");
		System.out.println(ac);
		System.out.println(cot);
		System.out.println(cable);
		System.out.println(wifi);
		System.out.println(laundry);
		}while(pr.equals("no")==true);
		System.out.println("Do you want to continue registration ?(yes/no)");
		String mn=sc.next();

		if(mn.equals("no")==true)
		{
		//while(mn.equals("yes")==true);{
		System.out.println("Customer ID  Customer Name  Email");
		for(int k=1;k<i;k++)
		{
		System.out.println(k+"  "+p[k]+"   "+em[k]);}
		}

		}

		

	}

