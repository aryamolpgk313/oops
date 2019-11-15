package polymorphism;

import java.util.Scanner;

public class Exampl2 {

	public static void main(String[] args) {
		Cal c=new Cal();
		   Scanner s=new Scanner(System.in);
		   System.out.println("1.Bread only");
		   System.out.println("2.Bread+Jam");
		   System.out.println("3.Bread+Jam+Butter");
		   System.out.println("Enter the choice");
		   int n=s.nextInt();
		   int n1=0,n2=0,n3=0;
		    
		   switch(n)
		   {
		     case 1:
		       c.cal(n1);
		       break;
		     case 2:
		       c.cal(n1,n2);
		        break;
		     case 3:
		       c.cal(n1,n2,n3);
		        break;
		   }
		  }
		}
		
class Cal{
	double j=4.1868;
	int x=74;
    int y=102;
    int z=26;
    double total=0.0;
    double c;
    Scanner s=new Scanner(System.in);
	public void cal(int n1) {
		System.out.println("Enter the number of slices of bread");
		   n1=s.nextInt();
		   c=n1*x;
		   total=n1*x*j;
		  System.out.printf("%.2f kj of energy generated from %.1f calories",total,c);	
		
	}

	public void cal(int n1, int n2) {
		 System
		 .out.println("Enter the number of slices of bread");
		    n1=s.nextInt();
		   System.out.println("Enter the number of teaspoon of jam");
		    n2=s.nextInt();
		   c=(n1*x)+(n2*y);
		   total=c*j;
		   System.out.printf("%.2f kj of energy generated from %.1f calories",total,c);
		
	}

	public void cal(int n1,int n2,int n3) {
		System.out.println("Enter the number of slices of bread");
		   n1=s.nextInt();
		  System.out.println("Enter the number of teaspoon of jam");
		   n2=s.nextInt(); 
		  System.out.println("Enter the number of teaspoon of Butter ");
		   n3=s.nextInt();
		   c=(n1*x)+(n2*y)+(n3*y);
		   total=c*j;
		  System.out.printf("%.2f kj of energy generated from %.1f calories",total,c);
		
	}
	
}