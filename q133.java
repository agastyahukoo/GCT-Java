package Java.GCT;

import java.util.Scanner;

public class q133 {
int sum =0;
void input()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number.");
	int num = sc.nextInt();
	for(int i=1; i <num; i++)
	{
		sum = sum+i;
	}
	System.out.println(sum);
	sc.close();
}
	public static void main(String[] args) {
q133 obj = new q133();
obj.input();
	}

}
