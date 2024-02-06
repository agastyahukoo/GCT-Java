package Java.GCT;

import java.util.Scanner;

public class q165 {
	int c;
	int num;
	double sum=0.0;
	double x = 0.0;
void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number.");
num= sc.nextInt();
sc.close();
}
void calc()
{
for(int c =1; c<= num;c++)
{
x +=2;
if(c%2==0)
{
	sum += x/(x-1);
}
else
{
	sum += (x-1)/x;
}
}
}
void display()
{
System.out.println("The sum of the series is "+sum);
}
public static void main(String[] args)
{
	q165 obj = new q165();
	obj.input();
	obj.calc();
	obj.display();
}
}
