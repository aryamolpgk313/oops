package inheritance;
import java.util.Scanner;
public class Single {

	public static void main(String[] args) {
     Scanner S=new Scanner(System.in);
     System.out.println("Enter the speed");
     int a=S.nextInt();
     Toyota d=new Toyota();
     d.name();
     d.about();
     d.speed(a);
	}

}
