package Java.GCT;

import java.util.Scanner;

public class q361 {
	int[] arr = new int[10];

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers.");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		}
		void check()
		{
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]<=arr[j])
					{
						System.out.println("True");
					}
					else
						System.out.println("False");
				}
			}
			
		}
		
	}
