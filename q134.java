package Java.GCT;

import java.util.Scanner;

public class q134 {
	int num;
	int sum;
void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number:");
num = sc.nextInt();
sc.close();
}
void calc()
{
for(int i=1; i<=num; i++)
{
if(i%2 ==0)
{
	sum = sum -i;
}
else
{
	sum = sum+i;
}
}
}
void display()
{
System.out.println(sum);	
}
	public static void main(String[] args) {
		q134 obj = new q134();
		obj.input();
		obj.calc();
		obj.display();
	}

}
