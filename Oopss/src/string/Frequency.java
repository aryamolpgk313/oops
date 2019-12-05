package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) throws IOException {
		
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
        String s = b.readLine().toUpperCase();
        for(char c='A';c<='Z';c++)
        {
            int count=0;
            for(int i=0;i<s.length();i++)
            {
                char x =s.charAt(i);
                if(x==c)
                    count++;
            }
            if(count>0)
            {
                System.out.println(c +"-" +count);
		
            }
	}
	}
}
