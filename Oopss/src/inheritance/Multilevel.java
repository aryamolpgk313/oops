package inheritance;

import java.util.Scanner;

public class Multilevel {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
        System.out.println("Enter the no of car");
        int n=S.nextInt();
        Model m=new Model();
        m.name();
        m.year();
        m.price();
        m.color();
	}
}
class Car2{
	void name() {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the name of car");
		String na=S.next();
		System.out.println(na);
	}
}
class Type extends Car2{
	void year() {
		System.out.println("2019 model");
	}
}
class Model extends Type{
	void price() {
		System.out.println("6 Lakh");
	}
	void color() {
		System.out.println("Colour:Red");
	}
}