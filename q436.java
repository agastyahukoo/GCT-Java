package Java.GCT;

import java.util.Scanner;

public class q436 {
	int[][] arr = new int[3][3];
	int count;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 9 elements.");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
	}
	void check()
	{
		count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+"\t");
				if(i==j)
				{
					if(arr[i][j]==1)
					{
						count++;
					}
				}
				else
				{
					if(arr[i][j] !=0)
					{
						count++;
					}
				}
			}
			System.out.println();
		}
		if(count==arr.length)
		{
			System.out.println("The matrix is an identity matrix.");
		}
		else
		{
			System.out.println("The matrix is not an identity matrix.");
		}
	}
	public static void main(String[] args)
	{
		q436 obj = new q436();
		obj.input();
		obj.check();
	}
}
