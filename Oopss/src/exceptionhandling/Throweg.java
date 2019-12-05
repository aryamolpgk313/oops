package exceptionhandling;

public class Throweg {

	public static void main(String[] args) {
		
		int a=10;
        int b=12;
        if(a>b)
        {
        	throw new ArithmeticException("A is greater");	
        }
        else
        {
        	throw new ArithmeticException("B is greater");	
        }
	}

}
