package Java.GCT;

import java.util.Scanner;

public class q135 {
int num;
int sum;
void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number: ");
num = sc.nextInt();
sc.close();
}
void calc()
{
for(int i=1; i <=num;i++)
{
	if(i%2 ==0)
	{
		sum = sum - (i*2);
	}
	else
	{
		sum = sum + (i*2);
	}
}
}
void display()
{
System.out.println(sum);	
}
	public static void main(String[] args) {
		q135 obj = new q135();
		obj.input();
		obj.calc();
		obj.display();

	}

}
