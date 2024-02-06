package Java.GCT;

import java.util.Scanner;

public class q62 {
int num;
void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number");
num = sc.nextInt();
sc.close();
}
void buzz(int n)
{
	int r=n%10;
	if(n%7 ==0 || r==7)
		System.out.println("Buzz Number");
	else
		System.out.println("Not Buzz Number");
}
	public static void main(String[] args) {
	q62 obj = new q62();
	obj.input();
	obj.buzz(obj.num);

	}

}
