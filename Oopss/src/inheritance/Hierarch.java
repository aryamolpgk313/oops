package inheritance;

import java.util.Scanner;

public class Hierarch {

	public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the State");
         String c=s.next();
         Dis1 k=new Dis1();
         Dis2 x=new Dis2();
         k.name(c);
         k.S1();
         x.S2();
         
	}
}
class State{
	void name(String c)
	{
		System.out.println("State:"+c);
	}
}
class Dis1 extends State{
	void S1() {
		System.out.println("Idukki");
	}
	
}
class Dis2 extends State{
	void S2() {
		System.out.println("Ernakulam");

	}
}