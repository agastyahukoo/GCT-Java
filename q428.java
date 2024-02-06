package Java.GCT;

import java.util.Scanner;

public class q428 {
	int[][] arr = new int[3][3];
	int sum;
	int product;
	Scanner sc = new Scanner(System.in);

	q428() {
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
		for (int j = 0; j < 3; j++) {
			sum += arr[2][j];
		}
		System.out.println("Sum of each row: " + sum);
	}

	public static void main(String[] args) {
		q428 obj = new q428();
		obj.input();
		obj.display();
	}
}
