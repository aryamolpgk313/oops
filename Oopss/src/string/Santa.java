package string;

import java.util.Arrays;
import java.util.Scanner;

public class Santa {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the guest's name");
		String gt=s.next();
		System.out.println("Enter the name of the residence host");
        String re=s.next();
	    String res=gt.concat(re);
	    char ch[]=res.toCharArray();
	    Arrays.sort(ch);
	    System.out.println("Enter the letters in a pile");
	    String pl=s.next();
	    char c[]=pl.toCharArray();
	    Arrays.sort(c);
	    String a=new String(ch);
	    String b=new String(c);
	    
	        if(a.equals(b))
	        {
	    	System.out.println("Yes");
	        }
	    else
	        {
	    	System.out.println("NO");
	        }
	      }
	     
	}
