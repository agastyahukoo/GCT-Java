package Java.GCT;
import java.util.Scanner;
public class q61 {
	int num;
void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number");
num = sc.nextInt();
sc.close();
}
void sunny(int n)
{
	double a= Math.sqrt(n+1);
	int b = (int)a;
	if(a==b)
		System.out.println("Sunny");
	else
		System.out.println("Not Sunny");
}
public static void main(String[] args)
{
q61 obj = new q61();
obj.input();
obj.sunny(obj.num);
}
}
