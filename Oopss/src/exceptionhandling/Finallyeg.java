package exceptionhandling;

public class Finallyeg {

	public static void main(String[] args) {
		    try
		     {
		    	int a[]=new int[25];
		    	a[8]=30/0;
		    	String s=null;
		    	int b=Integer.parseInt(s);
		     }	
		    catch(ArithmeticException e)
			{
	        	System.out.println(e);
			}
		    catch(NullPointerException e)
			{
	        	System.out.println(e);
			}
		    catch(ArrayIndexOutOfBoundsException e)
			{
	        	System.out.println(e);
			}
		    catch(NumberFormatException e)
			{
	        	System.out.println(e);
			}
		    catch(Exception e)
		    {
		    	System.out.println(e);	
		    }
		    finally
		    {
		    	System.out.println("Program closed");
		    }
		}

	}


