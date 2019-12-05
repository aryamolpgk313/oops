package string;

import java.util.Scanner;

public class Countletters {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=s.nextLine();
		int n=str.length();
		System.out.println(n);
		int smcount=0,capcount=0,numcount=0,spcount=0,vcount=0;
		for(int i=0;i<n;i++)
		{
			char c=str.charAt(i);
           if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
           {
        	  vcount++; 
           }
           else if(c>='a'&&c<='z')
           {
        	   smcount++;   
           }
           else if(c>='A'&&c<='Z')
           {
        	   capcount++;   
           }
           else if(c>='0'&&c<='9')
           {
        	numcount++;   
           }
           else
           {
        	   spcount++;
           }
		}
		System.out.println(vcount);
		System.out.println(smcount);
		System.out.println(capcount);
		System.out.println(numcount);
		System.out.println(spcount);
	}
}
