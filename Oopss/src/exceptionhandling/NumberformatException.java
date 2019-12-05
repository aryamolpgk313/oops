package exceptionhandling;

public class NumberformatException {

	public static void main(String[] args) {
		try {
			String s="abc";
			int a=Integer.parseInt(s);
			System.out.println(s);
		}
		catch(NumberFormatException e) 
		{
			System.out.println(e);
		}
	}

}
