package Java.GCT;

import java.util.Scanner;

public class q427 {
	int[][] arr = new int[5][5];
	int sum;
	int product;
	Scanner sc = new Scanner(System.in);
	q427()
	{
		 sum=0;
		 product=1;
	}
	void input() {
		System.out.println("Enter 25 elements");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	}

	void display() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				sum += arr[i][j];
				product *= arr[j][i];
			}
			System.out.println("Sum of each row: "+sum);
			System.out.println("Product of each column: "+product);
			sum=0;
			product=1;
		}
	}

	public static void main(String[] args) {
		q427 obj = new q427();
		obj.input();
		obj.display();
	}
}
