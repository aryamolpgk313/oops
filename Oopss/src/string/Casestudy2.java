package string;

import java.util.Scanner;

public class Casestudy2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int booked[]=new int[25];
		StringBuilder sb=new StringBuilder();
		int i=1;
		do {
		System.out.println("Registration");
		System.out.println();
        System.out.println("Enter your name");
        sb.append("Name :"+s.next()+"\n");
        System.out.println("Enter your address");
        sb.append("Address :"+s.next()+"\n");
        System.out.println("Enter your Contact number");
        sb.append("Ph no :"+s.next()+"\n");
        System.out.println("Email id");
        sb.append("Email :"+s.next()+"\n");
        System.out.println("Enter proof type");
        sb.append("Proof type :"+s.next()+"\n");
        System.out.println("Enter proof id");
        sb.append("Proof id"+s.next()+"\n");
        booked[i]=1;
        sb.append("Thank you for registering your id is "+i);
        i=i+1;
        System.out.println("Do you want to continue registration(y/n) ");
        
        if(s.next().equals("no"))
        {
        	System.out.println("Do you want to update email id(y/n)");	
        	if(s.next().equals("yes"))
        	{
        		System.out.println("Update email");
        		System.out.println("Enter new email");
        		sb.append("New email :"+s.next()+"\n");
        		System.out.println("Email updated");
        		System.out.println();
        	}
        	System.out.println("Your details are");
        	System.out.println();
        	System.out.println(sb);
        }
	}
	while(s.next().equals("yes"));
}
}

