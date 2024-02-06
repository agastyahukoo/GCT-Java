package Java.GCT;

import java.util.Scanner;

public class q81 {
	String name;
	String type;
	int days;
	double amount;
	double servicecharge;
	double total;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name, Room type and days stayed.");
		name = sc.next();
		type = sc.next();
	    days = sc.nextInt();
		sc.close();
	}
	void calc()
	{
		if(type.equalsIgnoreCase("Deluxe"))
		{
			double rate = 7500.0;
			amount = (double)days*rate;
		}
		else if(type.equalsIgnoreCase("Executive"))
		{
			double rate = 10000.0;
			amount = (double)days*rate;
		}
		servicecharge = amount*0.16;
		total = servicecharge + amount;
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Room Type: "+type);
		System.out.println("Days Stayed: "+days);
		System.out.println("Total: "+amount);
		System.out.println("Service Charge (16%): "+servicecharge);
		System.out.println("Grand Total: "+total);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q81 obj = new q81();
		obj.input();
		obj.calc();
		obj.display();
	}

}
