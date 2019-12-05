package patternmatch;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String email= "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		Pattern psswd=Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
		Pattern p = Pattern.compile(email);
		System.out.println("Enter email id");
		String ema=s.next();
		Matcher mail=p.matcher(ema);
		System.out.println("User name");
		String user=s.next();
		System.out.println("Password");
		String password=s.next();
		Matcher pswd=psswd.matcher(password);
		if(mail.matches())
		{
			System.out.println("Valid email");
		}
		else
		{
			System.out.println("Invalid email");
		}
		if(pswd.matches())
		{
			System.out.println("Valid password");
		}
		else
		{
			System.out.println("Invalid password");
		}
	}

	
}
