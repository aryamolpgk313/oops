package patternmatch;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {

	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String name1="[A-Z][a-z]*";//This pattern validates first letter of name should be capital letters
        String name2="[A-Z]+([ '-][a-zA-Z]+)*";
	    String email="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
	    String regno="^[0-9]*$";
	    String rank="^[0-9]*$";
	    String year="^[0-9]*$";
	    String dept="^[A-Z][.][a-z]*";
	    int f=1;
	    Pattern psswd=Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
	    System.out.println("Enter the first name");
	    String na1=s.next();
	    Pattern n1=Pattern.compile(name1);
	    Matcher nam1=n1.matcher(na1);
	    System.out.println("Enter the last name");
	    String na2=s.next();
	    Pattern n2=Pattern.compile(name2);
	    Matcher nam2=n1.matcher(na2);
	    System.out.println("Enter the email");
	    String em=s.next();
	    Pattern e=Pattern.compile(email);
	    Matcher ema=e.matcher(em);
	    System.out.println("Enter the reg no");
	    String re=s.next();
	    Pattern r=Pattern.compile(regno);
	    Matcher reg=r.matcher(re);
	    System.out.println("Enter the rank");
	    String ra=s.next();
	    Pattern rk=Pattern.compile(rank);
	    Matcher ran=rk.matcher(ra);
	    System.out.println("Enter the year");
	    String ye=s.next();
	    Pattern y=Pattern.compile(year);
	    Matcher yea=y.matcher(ye);
	    System.out.println("Enter the dept");
	    String de=s.next();
	    Pattern d=Pattern.compile(dept);
	    Matcher dep=d.matcher(de);
	    if(nam1.matches())
	    {
	    f=1;	
	    }
	    else
	    {
	    	System.out.println("Invalid name");
	    }
	    if(nam2.matches())
	    {
	    f=1;	
	    }
	    else
	    {
	    	System.out.println("Invalid last name");
	    }
	    if(ema.matches())
	    {
	    f=1;	
	    }
	    else
	    {
	    	System.out.println("Invalid email");
	    }
	    if(reg.matches())
	    {
	    	f=1;
	    }
	    else
	    {
	    	System.out.println("Invalid reg no");
	    }
	    if(ran.matches())
	    {
	    	f=1;
	    }
	    else
	    {
	    	System.out.println("Invalid rank");
	    }
	    if(yea.matches())
	    {
	    	f=1;
	    }
	    else
	    {
	    	System.out.println("Invalid year");
	    }
	    if(dep.matches())
	    {
	    	f=1;
	    }
	    else
	    {
	    	System.out.println("Invalid department");
	    }
	    if(nam1.matches()&&nam2.matches()&&ema.matches()&&reg.matches()&&ran.matches()&&yea.matches()&&dep.matches())
	    {
	    	System.out.println("Login");
	    	System.out.println("Username");
	    	String ur=s.next();
	    	if(ur.contentEquals(em))
	    	{
	    	System.out.println("Password");
	    	String password=s.next();
			Matcher pswd=psswd.matcher(password);
			if (pswd.matches())
			{
				System.out.println("User name :"+em);
				System.out.println("Password :"+password);	
			}
	    	}
			else
			{
				System.out.println("Invalid password");
			}
			System.out.println("Registration successful");
	    }
	    else
	    {
	    	System.out.println("Registration unsuccessful");
	    }
	}

}
