package Java.GCT;

import java.util.Scanner;

public class q472 {
	String sentence = "";
	char x;
	String newsentence = "";

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence.");
		sentence = sc.nextLine();
		sc.close();
	}

	void replace() {
		for (int i = 0; i < sentence.length(); i++) {
			x = sentence.charAt(i);
			if (Character.isLowerCase(x)) {
				x = '$';
				newsentence += x;
			} else if (Character.isUpperCase(x)) {
				x = '@';
				newsentence += x;
			} else {
				newsentence += x;
			}
		}
	}

	void display() {
		System.out.println(newsentence);
	}

	public static void main(String[] args) {
		q472 obj = new q472();
		obj.input();
		obj.replace();
		obj.display();

	}

}
