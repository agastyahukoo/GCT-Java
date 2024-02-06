package Java.GCT;

import java.util.Scanner;

public class q136 {
int sum=1;
int num;
void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number.");
num = sc.nextInt();
sc.close();
}
void calc()
{
for(int i =1; i<= num;i++)
{
if(i%2==0)
{
sum = sum+i;	
}
else
{
sum = sum*i;	
}
}
}
void display()
{
System.out.println(sum);	
}
	public static void main(String[] args) {
		q136 obj = new q136();
		obj.input();
		obj.calc();
		obj.display();

	}

}
