package polymorphism;

import java.util.Scanner;

public class Student1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        Stud st=new Stud();
        System.out.println("Enter name");
        String na=s.next();
        System.out.println("Enter roll no");
        int r=s.nextInt();
        System.out.println("Enter dept");
        String dept=s.next();
        System.out.println("Enter marks");
        int total=0;
        int avg=0;
        int m1=s.nextInt();
        int m2=s.nextInt();
        int m3=s.nextInt();
        int m4=s.nextInt();
        int m5=s.nextInt();
        st.stud(na);
        st.stud(r);
        st.stud(m1,m2,m3,m4,m5,total);
        st.stud(total,avg, m1, m2, m3, m4, m5);
        st.stud(dept);
	}
}
class Stud
{

	public void stud(int r) {
		System.out.println("Roll no "+r);
		
	}
	public void stud(int m1, int m2, int m3, int m4, int m5, int total) {
		total=m1+m2+m3+m4+m5;
		System.out.println("Total  "+total);
		if(total>450)
		{
			System.out.println("Rank 1");
		}
		else if(total<400&&total<=350)
		{
			System.out.println("Rank 2");
		}
		else if(total<350&&total<=300)
		{
			System.out.println("Rank 3");	
		}
		else
		{
			System.out.println("Failed");
		}
	}
	public void stud(int m1, int m2, int m3, int m4, int m5, int total, int avg) {
		avg=m1+m2+m3+m4+m5/5;
		System.out.println("Average  "+avg);
		
	}

	public void stud(String na) {
		System.out.println("Name  "+na);
		
	}
	
}