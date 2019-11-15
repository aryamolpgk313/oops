package polymorphism;

public class Ride1 {

	public static void main(String[] args) {
		Abc o1=new Abc();
		o1.disp();
		Demo o2=new Demo();
		o2.disp();
	}
}
class Abc
{
 public void disp()
 {
  System.out.println("Parent class");	 
 }
 }
class Demo extends Abc
{
	public void disp()
	 {
	  System.out.println("Child class");	 
	 }
}