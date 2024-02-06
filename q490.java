package Java.GCT;

import java.util.Scanner;

public class q490 {
	String sentence;
	String newsentence;
	String word;
	String old;
	String replace;
	char x;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence, word to find and word to replace.");
		sentence = sc.nextLine();
		old = sc.next();
		replace = sc.next();
		sc.close();
	}

	void replace() {
		for (int i = 0; i < sentence.length(); i++) {
			x = sentence.charAt(i);
			if (!Character.isWhitespace(x)) {
				word += x;
			} else {
				if (word.equalsIgnoreCase(old)) {
					word = replace;
					newsentence += word;
				} else {

				}
				word = "";
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
