package Java.GCT;

import java.util.Scanner;

public class q137 {
double sum=1.0;
double num;
void input()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number.");
	num = sc.nextDouble();
	sc.close();
}
void calc()
{
	for(double i=1.0; i < num;i++)
	{
		sum=sum+(i/2);
	}
}
void display()
{
System.out.println(sum);	
}
	public static void main(String[] args) {
		q137 obj = new q137();
		obj.input();
		obj.calc();
		obj.display();

	}

}
