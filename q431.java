package Java.GCT;

import java.util.Scanner;

public class q431 {
	int[][] arr = new int[4][4];
	int sum;
	Scanner sc = new Scanner(System.in);
	q431() {
		sum = 0;
	}

	void input() {
		System.out.println("Enter 9 elements");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	}

	void display() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] % 4 == 0) {
					sum += arr[i][j];
				}
			}
		}
		System.out.println("Sum:" + sum);
	}

	public static void main(String[] args) {
		q431 obj = new q431();
		obj.input();
		obj.display();
	}
}
