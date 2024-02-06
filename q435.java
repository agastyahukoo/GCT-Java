package Java.GCT;

import java.util.Scanner;

public class q435 {
	int[][] arr = new int[3][3];
	int[][] temp = new int[3][3];
	int n = arr.length;
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.println("Enter 9 elements.");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	}
	void swap()
	{
		for (int i = 0; i < arr.length; i++) {
         int x = arr[i][i];
         arr[i][i] = arr[i][n-1-i];
         arr[i][n-1-i] = x;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		q435 obj = new q435();
		obj.input();
		obj.swap();
	}
}
