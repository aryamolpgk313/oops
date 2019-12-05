package string;

import java.util.Scanner;

public class Casestudypoly {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Car ca=new Car();
		Bike bi=new Bike();
		System.out.println("1)Bike \n2)Car");
		int n=s.nextInt();
		switch(n) {
		case 1: bi.display();
		break;
		case 2:ca.display();
		break;
		default:System.out.println("Invalid option");
		}
	}
}
class Car{
	public void display()
	{
		Scanner s=new Scanner(System.in);
		StringBuilder c=new StringBuilder();
		System.out.println("Enter details of car");
		System.out.println("Enter the color");
		c.append("Colour :"+s.next()+"\n");
		System.out.println("Enter the maximum speed");
		c.append("Speed :"+s.next()+"\n");
		System.out.println("Enter the number of seats");
		c.append("no of seats :"+s.next()+"\n");
		System.out.println("Enter the number of wheels");
		c.append("no of wheels :"+s.next()+"\n");
		System.out.println("Enter the number of doors");
		c.append("no of doors :"+s.next()+"\n");
		System.out.println("Enter the status of AC(true/false)");
		c.append("AC :"+s.next()+"\n");
		System.out.println(c);	
	}
}
class Bike{
	public void display()
	{
		Scanner s=new Scanner(System.in);
		StringBuilder b=new StringBuilder();
		System.out.println("Enter details of bike");
		System.out.println("Enter the color");
		b.append("Colour :"+s.next()+"\n");
		System.out.println("Enter the maximum speed");
		b.append("Speed :"+s.next()+"\n");
		System.out.println("Enter the number of seats");
		b.append("No of seats :"+s.next()+"\n");
		System.out.println("Enter the number of wheels");
		b.append("No of wheels :"+s.next()+"\n");
		System.out.println("Enter the status of diskbreak(true/false)");
		b.append("Disk break :"+s.next()+"\n");
		System.out.println(b);
	}
}