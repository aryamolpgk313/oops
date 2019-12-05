package string;

import java.util.Scanner;

public class Casestudy3 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		StringBuilder b=new StringBuilder();
		StringBuilder c=new StringBuilder();
		System.out.println("1)Bike \n2)Car");
		int n=s.nextInt();
		switch(n) {
	case 1:
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
		break;
	case 2:
		System.out.println("Enter details of car");
		System.out.println("Enter the color");
		c.append("Colour :"+s.next()+"\n");
		System.out.println("Enter the maximum speed");
		c.append("Speed :"+s.next()+"\n");
		System.out.println("Enter the number of seats");
		c.append("no of seats :"+s.next()+"\n");
		System.out.println("Enter the number of wheels");
		c.append("no of wheels :"+s.next()+"\n");
		System.out.println("Enter the status of AC(true/false)");
		c.append("AC :"+s.next()+"\n");
		System.out.println(c);
		break;
		default:
		System.out.println("Invalid option");
	}
}
	
}