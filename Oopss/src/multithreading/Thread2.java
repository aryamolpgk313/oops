package multithreading;

public class Thread2 {

	public static void main(String[] args) {
		Car c=new Car();
		Car1 c1=new Car1();
		Car2 c2=new Car2();
		c.start();
		c1.start();
		c2.start();
	}
}
class Car extends Thread{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			if(i==1) yield();
			System.out.println("Car A running "+i);
		}
		System.out.println("Car A running complete");
	}
}
class Car1 extends Thread{
	public void run()
	{
	for(int i=0;i<=5;i++)
	{
	if(i==2)stop();	
	{
	System.out.println("Car B running ");	
	}
	}
	System.out.println("Car B running complete");
	}
}
class Car2 extends Thread{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			if(i==3)
			{
				try {
					System.out.println("Car running sleep");
					Thread.sleep(10000);
				   }
				catch(InterruptedException e)
				{
				e.printStackTrace();	
				}
				}
			}
	}
}
