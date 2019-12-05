package string;

import java.util.Scanner;

public class ReverseEvenindex {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.nextLine();//reading a string
		String word[]=str.split(" ");//split words
       for(int i=0;i<word.length;i++)
       {
    	   if(i%2!=0)
    	   {
    		   int length=word[i].length();
    		   for(int j=length-1;j>=0;j--)//reverse word
    		   {
    			   System.out.print(word[i].charAt(j));
    		   }
    		   System.out.print(" ");
    	   }
    	   else 
    	   {
    	      System.out.print(word[i]+" ");   
    	   }
       }
	}

}
