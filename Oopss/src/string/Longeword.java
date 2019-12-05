package string;

import java.util.Scanner;

public class Longeword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner s=new Scanner(System.in);
		   System.out.println("Enter a string");
			String st=s.nextLine();
			  String large="";
			  int i=0,j=0;
			String w[]=st.split(" ");
			  int length=w.length;
			  for(i=0;i<length;i++)
			  {
			  for(j=i+1;j<length;j++)
			  {
			  if(w[i].length()>w[j].length())
			    {
			     large=w[i];
			     }
			  else {
				  large=w[j]; 
			  } 
			    } 
			 }
		 System.out.println(large);
			int len=large.length(); 
			  int count=0;
			  for(i=0;i<len;i++)
			  {
			    count++;
			  }
			 System.out.println(count); 
		  }
	}


