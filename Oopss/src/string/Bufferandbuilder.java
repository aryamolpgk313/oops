package string;

public class Bufferandbuilder {

	public static void main(String[] args) {
        //String buffer
		StringBuffer s=new StringBuffer("Hello");
		s.append("face");
		System.out.println(s);
		
		//StringBuilder
		StringBuilder a=new StringBuilder("Hello");
		a.append("face");
		System.out.println(a);
	}

}
