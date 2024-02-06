package Java.GCT;

import java.util.Scanner;

public class q437 {
	int[][] arr = new int[3][3];

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 9 elements.");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
	}

	void print() {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr.length - 1; j >= 0; j--) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		q437 obj = new q437();
		obj.input();
		obj.print();
	}
}
