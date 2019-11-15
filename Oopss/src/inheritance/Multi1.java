package inheritance;

import java.util.Scanner;

public class Multi1 {

	public static void main(String[] args) {
		 Scanner S=new Scanner(System.in);
		    System.out.println("Enter the name");
		    String n=S.next();
		 	Depart d=new Depart();
		 	d.name(n);
		 	d.rollno();
		 	d.department();
		 	d.place();
			}
		}
		class Person{
			void name(String n) {
				System.out.println(n);
			}
		}
		class Details extends Person{
			void rollno() {
				System.out.println("13");
			}
		}
		class Depart extends Details{
			Scanner S=new Scanner(System.in);
			void department() {
				System.out.println("CSE");
			}
			void place() {
				System.out.println("Idukki");
				

	}

}
