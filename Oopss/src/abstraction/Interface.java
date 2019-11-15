package abstraction;

import java.util.Scanner;

public class Interface {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");  
		String n=s.next();
		System.out.println("Enter the id");
        int id=s.nextInt();
        System.out.println("Enter the total");
        int t=s.nextInt();
        Student2 st=new Student2();
        st.detail(n,id);
        st.total(t);
	}
}
interface ranks
{
	public void detail(String n,int id);
}
interface total
{
	public void total(int t);
}
class Student2 implements ranks,total
{
	public void detail(String n,int id)
	{
	System.out.println("Name "+n);
	System.out.println("Id "+id);
	}
	public void total(int t)
	{
		System.out.println("Total"+t);
	}
}
