package Java.GCT;

import java.util.Scanner;

public class q67 {
int months;
int years;
int days;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of months and years.");
		months = sc.nextInt();
		years=sc.nextInt();
		sc.close();
	}
	void calc()
	{
		if(months==1 || months==3 || months==5 || months == 7 || months == 8 || months == 10 || months == 12)
		{
			days=31;
		}
		else if(months == 2)
		{
			days = 21;
		}
		else
		{
			days = 30;
		}
		if(years%4 == 0)
		{
			days+=366;
		}
		else
		{
			days+=365;
		}
	}
	void display()
	{
		System.out.println("Number of days: "+days);
	}
	public static void main(String[] args) {
q67 obj = new q67();
obj.input();
obj.calc();
obj.display();

	}

}
