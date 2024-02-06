package Java.GCT;

import java.util.Scanner;

public class q429 {
	int[][] arr = new int[3][3];
	int sum;
	int product;
	Scanner sc = new Scanner(System.in);
	q429() {
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
			sum += arr[i][2];
		}
		System.out.println("Sum of last column: " + sum);
	}

	public static void main(String[] args) {
		q429 obj = new q429();
		obj.input();
		obj.display();
	}
}
