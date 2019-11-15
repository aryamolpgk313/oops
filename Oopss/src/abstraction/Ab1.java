package abstraction;

import java.util.Scanner;

public class Ab1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=s.next();
		System.out.println("Enter the id");
        int id=s.nextInt();
        System.out.println("Enter the marks");
        int m1=s.nextInt();
        int m2=s.nextInt();
        int m3=s.nextInt();
        int m4=s.nextInt();
        int m5=s.nextInt();
        Student st=new Student();
        st.totalmark(name,id,m1,m2,m3,m4,m5);

	}
}
abstract class rank{
	abstract void totalmark(String name,int id,int m1,int m2,int m3,int m4,int m5);
	public void rank1(int m1,int m2,int m3,int m4,int m5)
	{
		System.out.println("Mark1 "+m1);	
		System.out.println("Mark2 "+m2);
		System.out.println("Mark3 "+m3);
		System.out.println("Mark4 "+m4);
		System.out.println("Mark5 "+m5);
	}
}
class Student extends rank
{
void totalmark(String name,int id,int m1,int m2,int m3,int m4,int m5)
{
System.out.println("Name "+name);
System.out.println("Id "+id);
super.rank1(m1,m2,m3,m4,m5);
int total=m1+m2+m3+m4+m5;
System.out.println("Total "+total);
int avg=total/5;
System.out.println("Average "+avg);
}
}