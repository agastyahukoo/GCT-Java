package Java.GCT;

import java.util.Scanner;

public class q425 {
	int[][] arr = new int[3][3];
int zero;
int positive;
int negative;
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
			for (int j = 0; j < 3; j++) {
				if(arr[i][j] == 0)
					zero++;
				else if(arr[i][j] > 0)
					positive++;
				else
					negative++;
				
			}
		}
		System.out.println("Number of positive numbers in the array: "+positive);
		System.out.println("Number of negative numbers in the array: "+negative);
		System.out.println("Number of 0 numbers in the array: "+zero);
	}

	public static void main(String[] args) {
		q425 obj = new q425();
		obj.input();
		obj.display();
	}
}
