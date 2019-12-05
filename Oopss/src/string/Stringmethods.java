package string;

import java.util.Scanner;

public class Stringmethods {

	public static void main(java.lang.String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a");
        String a=s.next();
       String b="now is the";
        
        System.out.println("Lenth "+b.length());//length
        System.out.println("Char at 4 is "+b.charAt(4));//char at index
        System.out.println("substring " +a.substring(2,5));//substring
        System.out.println("start "+b.startsWith("is"));//check if starts with is
        System.out.println("index "+b.indexOf("is"));//index value
        System.out.println("Concat "+a.concat(b));//concatenation
        System.out.println("Relace "+b.replace("t","T"));//replace character
        String word[]=b.split(" ");//split
        for(String ar:word)
        {
        System.out.println(ar);
        }
        System.out.println("Equal "+a.equals(b));
        System.out.println(b.toUpperCase());
        System.out.println(a.toLowerCase());
	}
}
