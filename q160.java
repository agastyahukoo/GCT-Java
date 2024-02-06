package Java.GCT;

import java.util.Scanner;

public class q160 {
	int num;
	int sum=12;
	int x = 2;
void input()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number.");
	num = sc.nextInt();
	sc.close();
	}
void calc()
{
for(int i=0; i <num;i++)
{
	x += 10;
	sum = sum +x;
}
}
void display()
{
	System.out.println("The sum of the series is "+sum);
}
public static void main(String[] args)
{
	q160 obj = new q160();
	obj.input();
	obj.calc();
	obj.display();
}
}
