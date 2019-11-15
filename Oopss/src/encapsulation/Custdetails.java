package encapsulation;

import java.util.Scanner;

public class Custdetails {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[25];
		int i=2;
		Customer c=new Customer();
		Display d=new Display();
		System.out.println("Registration\n");
		System.out.println("Enter your name");
		c.setName(s.next());
		System.out.println("Enter your address");
		c.setAddress(s.next());
		System.out.println("Contact number");
		c.setContactnumber(s.next());
		System.out.println("Email id");
        c.setEmail(s.next());
        System.out.println("Enter proof type");
        c.setProoftype(s.next());
        System.out.println("Enter proof id");
        c.setProofid(s.next());
        d.Display(c.getName(),c.getAddress(),c.getContactnumber(),c.getEmail(),c.getProoftype(),c.getProofid());
        System.out.println("Thank you for registering,your id is "+i);
	}
}
