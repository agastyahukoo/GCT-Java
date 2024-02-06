package Java.GCT;

import java.util.Scanner;

public class q433 {
	int[][] arr = new int[3][3];
	Scanner sc = new Scanner(System.in);

	void input() {
		System.out.println("Enter 9 elements");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	}

	void display() {
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
      if(i==j)
      {
    	  System.out.print(arr[i][j]+ "\t");
      }
      else {
    	  System.out.print("\t");
    	  
      }
	}
	System.out.println();
}
	}

	public static void main(String[] args) {
		q433 obj = new q433();
		obj.input();
		obj.display();
	}
}
