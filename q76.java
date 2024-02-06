package Java.GCT;
import java.util.Scanner;
public class q76 {
	String name;
	double calls;
	double amount;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name.");
		name = sc.next();
		System.out.println("Enter number of calls");
		calls = sc.nextDouble();
		sc.close();
	}
	void calc()
	{
		if(calls<=100)
		{
			amount = 250;
		}
		if(calls>100 && calls<=200)
		{
			calls -= 100;
			amount = calls*1.5;
			amount += 25;
		}
		if(calls>200 && calls<=250)
		{
			calls -= 200;
			amount = calls*1;
			amount += 400;
		}
		if(calls>250)
		{
			calls -=250;
			amount = calls*0.5;
			amount += 450;
		}
	}
	void display()
	{
		System.out.println("Name: "+name);
	System.out.println("The Amount is: $"+amount);
	}

	public static void main(String[] args) 
	{
		q76 obj = new q76();
		obj.input();
		obj.calc();
		obj.display();
	}

}
