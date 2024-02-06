package Java.GCT;

import java.util.Scanner;

public class q46 {
	String name;
	String address;
	double rate;
	double days;
	double total;
	double net;
	void input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name,address, rate and days stayed.");
		name = sc.nextLine();
		address = sc.nextLine();
		rate = sc.nextDouble();
		days = sc.nextDouble();
		sc.close();
	}
    void display()
    {
    	System.out.println("Name: "+name);
    	System.out.println("Address: "+address);
    	double temp = rate*days;
    	double total = temp*0.80;
    	System.out.println("Total: $"+total);
    	System.out.println("Service Charge: 16%");
    	double grandtotal = total+total*0.16;
    	System.out.println("Grand Total: $"+grandtotal);
    }
	public static void main(String[] args) {
		q46 obj = new q46();
		obj.input();
		obj.display();

	}

}
