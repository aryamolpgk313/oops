package multithreading;

import java.util.Scanner;

public class Thread3 {

	public static void main(String[] args) {
		Word w=new Word();
		w.start();
		

	}

}
class Word extends Thread{
	public void run()
	{
	Scanner s=new Scanner(System.in);
	String st=s.next();
	
	}
	}