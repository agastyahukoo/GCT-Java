package Java.GCT;

import java.util.Scanner;

public class q434 {
	int[][] arr = new int[3][3];
	int sum;

	void input() {
		System.out.println("Enter 9 elements");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
	}

	void sum() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					sum += arr[i][j];
				} else if ((i + j) == (arr.length - 1) && i != j) {
					sum += arr[i][j];
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		q434 obj = new q434();
		obj.input();
		obj.sum();
	}
}
