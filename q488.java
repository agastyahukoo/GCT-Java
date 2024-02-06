package Java.GCT;

import java.util.Scanner;

public class q488 {
	String sentence = "";
	String word = "";
	String search = "";
	int count = 0;
	char x;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a sentence.");
		sentence = sc.nextLine();
		System.out.println("Input a word to search.");
		search = sc.next();
		sc.close();
	}

	void search() {
		for (int i = 0; i < sentence.length(); i++) {
			x = sentence.charAt(i);
			if (!Character.isWhitespace(x)) {
				word += x;
			} else {
				if (word.equalsIgnoreCase(search)) {
					count++;
				}
				word = "";
			}
		}
	}

	void display() {
		System.out.println(count);
	}

	public static void main(String[] args) {
		q488 obj = new q488();
		obj.input();
		obj.search();
		obj.display();
	}

}
