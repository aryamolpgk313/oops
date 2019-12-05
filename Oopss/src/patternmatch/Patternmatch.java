package patternmatch;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patternmatch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Pattern p=Pattern.compile(".@");//. accept single character
		Matcher m=p.matcher("a@");//check for match in pattern
		boolean b=m.matches();//returns boolean value after checking match
		System.out.println(b);
	}

}
