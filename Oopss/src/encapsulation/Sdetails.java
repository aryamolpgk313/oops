package encapsulation;

import java.util.Scanner;

public class Sdetails {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		Student st=new Student();
		System.out.println("Enter the name");
		st.setName(S.next());
		System.out.println("Enter the id");
		st.setId(S.nextInt());
		System.out.println("Name :"+st.getName());
		System.out.println("Id :"+st.getId());


	}

}
