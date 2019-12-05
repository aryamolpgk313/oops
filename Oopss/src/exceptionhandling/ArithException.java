package exceptionhandling;

public class ArithException {

	public static void main(String[] args) {
		int a;
		try {
		 
		a=50/0;
		System.out.println(a);
		}
        catch(ArithmeticException e)
		{
        	System.out.println(e);
		}
		
	}

}
