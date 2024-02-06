package Java.GCT;

import java.util.Scanner;

public class q424 {
	int[][] arr = new int[3][3];

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

	void display() {
		for (int i = 0; i < 3; i++) {
			for (int j = 2; j >= 0; j--) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		q424 obj = new q424();
		obj.input();
		obj.display();
	}
}
