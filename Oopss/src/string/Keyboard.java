package string;

import java.util.Scanner;

public class Keyboard {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuilder c = new StringBuilder();
		String st = "qwertyuiop asdfghjkl; zxcvbnm,./";
		char chr[] = st.toCharArray();
		System.out.println("Enter a character");
		char ch = s.next().charAt(0);
		System.out.println("Enter the string");
		String str = s.next();
		char chara[] = str.toCharArray();
		System.out.println("The original message");
		for (int i = 0; i < str.length(); i++) {// for user given string
			for (int j = 0; j < chr.length; j++) {//for keyboard string
				if (chara[i] == (chr[j]) && ch == 'R') {
					c.append(chr[j - 1]);                 
				}
				if (chara[i] == (chr[j]) && ch == 'L') {
					c.append(chr[j + 1]);
				}
			}

		}
		System.out.println(c);
	}

}
