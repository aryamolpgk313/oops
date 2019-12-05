package exceptionhandling;

public class ArrayIndexOutOfBoundExcepion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] a= {1,3,5,7};
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
