package inheritance;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Example {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the number");
        int n=S.nextInt();
        Student p=new Student();
        p.name();
        p.roll(n);
        p.place();
	}
}
class Register{
	void name() {
		System.out.println("Arya");
	}
	
}
class Student extends Register{
	void place() {
		System.out.println("idukki");		
	}
	void roll(int n) {
		System.out.println("Roll no is "+n);
	}
}
