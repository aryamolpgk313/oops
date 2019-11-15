package polymorphism;

import java.util.Scanner;

 class Car1 {
	public void displaydetails(String color,String spd,String seat,String whls,String db) {
		System.out.println("Car Details");
		System.out.println("Color:"+color);

		System.out.println("Maximum speed:"+spd);

		System.out.println("Number of seats:"+seat);

		System.out.println("Number of wheels:"+whls);
		System.out.println("AC:"+db);


		}
		}
		class Bike extends Car1{

		public void displaydetails(String color,int spd,int seat,int whls,String db) {
		System.out.println("Bike Details");

		System.out.println("Color:"+color);

		System.out.println("Maximum speed:"+spd);

		System.out.println("Number of seats:"+seat);

		System.out.println("Number of wheels:"+whls);

		System.out.println("Disk break:"+db);

		}
		}

		public class Vehicle {

		public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		    Bike bi=new Bike();
		Car1 ob=new Car1();
		System.out.println("1)Bike \n2)Car");
		int n=s.nextInt();
		switch(n) {
		case 1:
		System.out.println("Enter details of bike");
		System.out.println("Enter the color");
		String color=s.next();
		System.out.println("Enter the maximum speed");
		int  spd=s.nextInt();
		System.out.println("Enter the number of seats");
		int  seat=s.nextInt();
		System.out.println("Enter the number of wheels");
		int  whls=s.nextInt();
		System.out.println("Enter the status of diskbreak(true/false)");
		String db=s.next();
		bi.displaydetails( color, spd, seat, whls,db);
		break;
		case 2:
		System.out.println("Enter details of car");
		System.out.println("Enter the color");
		String color1=s.next();
		System.out.println("Enter the maximum speed");
		String  spd1=s.next();
		System.out.println("Enter the number of seats");
		String  seat1=s.next();
		System.out.println("Enter the number of wheels");
		String  whls1=s.next();
		System.out.println("Enter the status of AC(true/false)");
		String db1=s.next();
		ob.displaydetails( color1, spd1, seat1, whls1,db1);
		break;
		default:
		System.out.println("Invalid option");
		}
		}

		}

	