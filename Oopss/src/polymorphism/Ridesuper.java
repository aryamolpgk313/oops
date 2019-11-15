package polymorphism;

public class Ridesuper {

	public static void main(String[] args) {
		Demo1 o1=new Demo1();
		o1.disp1();
	}
}
class Abcd
{
public void disp1()
{
System.out.println("Parent class");
}
}
class Demo1 extends Abcd
{
	public void disp1()
	{
		super.disp1();
		System.out.println("Child class");
		
	}
}