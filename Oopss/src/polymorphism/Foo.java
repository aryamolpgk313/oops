package polymorphism;

import java.util.Scanner;

public class Foo {

		  public static void main(String args[])
		  {
		        Cal c=new Cal();
		   Scanner s=new Scanner(System.in);
		   System.out.println("1.Bread only");
		   System.out.println("2.Bread+Jam");
		   System.out.println("3.Bread+Jam+Butter");
		   System.out.println("Enter the choice");
		   int n=s.nextInt();
		    switch(n)
		   {
		     case 1:
		        System.out.println("Enter the number of Slice of bread");
		        int n1=s.nextInt();
		       c.cal(n1);
		       break;
		     case 2:
		        System.out.println("Enter the number of Slice of bread");
		         int n2=s.nextInt();
		        System.out.println("Enter the number of teaspoon of jam");
		       int n3=s.nextInt();
		        c.cal(n2,n3);
		        break;
		     case 3:
		        System.out.println("Enter the number of Slice of bread");
		        int n4=s.nextInt();
		        System.out.println("Enter the number of teaspoon of jam");
		        int n5=s.nextInt(); 
		        System.out.println("Enter the number of teaspoon of Butter ");
		        int n6=s.nextInt();
		        c.cal(n4,n5,n6);
		        break;
		      default:System.out.println("Invalid input");
		        
		   }
		  }
		}
		class Cal
		{

		public void cal(int n1)
		{
		  double re1=(n1*74);
		   double r=4.1868;
		  double  total=re1*r;
		  System.out.printf("%.3f KJ of energy generated from %.1f calories",total,re1);
		}
		 public void cal(int n2,int n3)
		 {
		   double r=4.1868;
		    double re2=(n2*74)+(n3*26);
		   double  total=re2*r;
		   System.out.printf("%.3f KJ of energy generated from %.1f calories",total,re2);
		 }
		 public void cal(int n4,int n5,int n6)
		 {
		   double r=4.1868;
		   double re3=(n4*74)+(n5*26)+(n6*102);
		  double total=re3*r;
		  System.out.printf("%.2f KJ of energy generated from %.1f calories",total,re3);
		 }
		}
