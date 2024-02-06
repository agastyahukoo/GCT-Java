package Java.GCT;

import java.util.Scanner;

public class q371 {
	String[] arr = new String[10];

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 words.");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		sc.close();
	}

	void print() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() == 5) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		q371 obj = new q371();
		obj.input();
		obj.print();
	}
}
