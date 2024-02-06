package Java.GCT;

import java.util.Scanner;

public class q138 {
double num;
double sum=1.5;
void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number.");
num = sc.nextDouble();
sc.close();
}
void calc()
{
	double x = 1.0;
	double y =2.0;
for(double i =1.0;i< num;i++)
{
    x+=2;
	y+=2;
	sum+=x/y;
}
}
void display()
{
System.out.println(sum);
}
	public static void main(String[] args) {
		q138 obj = new q138();
		obj.input();
		obj.calc();
		obj.display();
	}

}
