package project;
import java.util.Scanner;
public class Details {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Person p=new Person();
		p.detail();
		p.mark();

		}
		}
		class Person{
		Scanner S=new Scanner(System.in);

		void detail()
		{
		String name;
		int age;
		System.out.println("Enter the name");
		name=S.next();
		System.out.println("Enter the age");
		age=S.nextInt();
		System.out.println(name);
		System.out.println(age);
		}
		void mark()
		{
		System.out.println("Enter the marks");
		int m1=S.nextInt();
		int m2=S.nextInt();
		int m3=S.nextInt();
		int total=m1+m2+m3;
		System.out.println("Total is");
		System.out.println(total);
		}
}