package Java.GCT;
import java.util.Scanner;
public class q77 {
	String name;
	double units;
	double amount;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name.");
		name = sc.next();
		System.out.println("Enter number of units.");
		units = sc.nextDouble();
		sc.close();
	}
	void calc()
	{
		if(units<=100)
		{
			amount = 25;
		}
		if(units>100 && units<=150)
		{
			units -= 100;
			amount = units*0.75;
			amount += 25;
		}
		if(units>150 && units<=175)
		{
			units -= 200;
			amount = units*1;
			amount += 400;
		}
		if(units>175)
		{
			units -=250;
			amount = units*2;
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
		q77 obj = new q77();
		obj.input();
		obj.calc();
		obj.display();
	}

}
