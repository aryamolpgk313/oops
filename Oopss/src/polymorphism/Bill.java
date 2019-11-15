package polymorphism;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Telephone Bill Number :");	 
		int tb=s.nextInt();
		System.out.println("Enter the customer name :");	 
		String na=s.next();
		System.out.println("Enter the Number of Calls made:");	 
		double cl=s.nextDouble();
		System.out.println("Enter the Cost per call :");	 
		double cst=s.nextDouble();
		System.out.println("Enter the Current Bill Number :");	 
		int cb=s.nextInt();
		System.out.println("Enter the customer name :");	 
		String na1=s.next();
		System.out.println("Enter the Number of units consumed:");	 
		double un=s.nextDouble();
		System.out.println("Enter the Cost per unit :");	 
		double cst1=s.nextDouble();
		Currentbill c=new Currentbill();
		c. generateBill(un,cst1,cb,na1);
		Telephonebill t=new Telephonebill();	
		t. generateBill(cl,cst,tb,na);
	}
}
class Currentbill
{
 Scanner s=new Scanner(System.in);
 public void generateBill(double un,double cst1,int cb,String na1)	
 {
  double total=un*cst1;
  System.out.println("Bill Number :"+cb);
  System.out.println("Customer Name :"+na1);
  System.out.println("Current Bill Amount:"+total);
 }
}
class Telephonebill extends Currentbill
{
 public void generateBill(double cl,double cst,int tb,String na )	
 {
	 double total=cl*cst;
	 System.out.println("Bill Number :"+tb);
	 System.out.println("Customer Name :"+na);
	 System.out.println("Telephone Bill Amount:"+total);   
 }
}