package string;

import java.util.Scanner;

public class Employeedetails {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Employee Details");
		StringBuilder sb=new StringBuilder();
        System.out.println("Enter the name");
        sb.append("Name : "+s.next()+"\n");
        System.out.println("Enter the id");
        sb.append("Id : "+s.next()+"\n");
        System.out.println("Enter the Age");
        sb.append("Age : "+s.next()+"\n");
        System.out.println("Enter the salary");
        sb.append("Salary : "+s.next()+"\n");
        System.out.printf("%s",sb);
	}
}













