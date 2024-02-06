package Java.GCT;

import java.util.Scanner;

public class q48 {

	public static void main(String[] args) {
		System.out.println("Enter marks");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if(marks>=35)
		{
			System.out.println("You have passed.");
		}
		sc.close();
	}

}
