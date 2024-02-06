package Java.GCT;

import java.util.Scanner;

public class q37 {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter name, wages and hours worked.");
	String name = sc.nextLine();
	String wages = sc.nextLine();
	int hours = sc.nextInt();
	int Intwages = Integer.parseInt(wages);
	int total = hours*Intwages;
	int annual = total*365;
	System.out.println("Total made by " +name+" annually:"+annual);

	sc.close();
}
}
