package Java.GCT;

import java.util.Scanner;

public class q432 {
	int[][] arr = new int[3][3];
	int count;
	int temp;
	Scanner sc = new Scanner(System.in);
	q432() {
		count = 0;
		temp=0;
	}

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
	temp=0;
      for(int x=1;x<=arr[i][j];x++)
      {
    	  if(arr[i][j]%x==0)
    	  {
    		  temp++;
    	  }
    	  
      }
      if(temp==2)
      {
    	  count++;
      }
	}
}
		System.out.println("Number of prime numbers:" + count);
	}

	public static void main(String[] args) {
		q432 obj = new q432();
		obj.input();
		obj.display();
	}
}
