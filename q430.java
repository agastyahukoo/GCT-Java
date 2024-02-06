package Java.GCT;

import java.util.Scanner;

public class q430 {
	int[][] arr = new int[4][4];
	int sum;
	int product;
	int n;
	Scanner sc = new Scanner(System.in);
	q430() {
		sum = 0;
	}

	void input() {
		System.out.println("Enter 16 elements");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter value of n");
		n = sc.nextInt();
	}

	void display() {
		for (int i = 0; i < n; i++) {
			if (i != n-1) {
				sum += arr[n-1][i];
				sum += arr[i][n-1];
			} else {
				sum += arr[n-1][n-1];
			}
		}
		System.out.println("Sum:" + sum);
	}

	public static void main(String[] args) {
		q430 obj = new q430();
		obj.input();
		obj.display();
	}
}
