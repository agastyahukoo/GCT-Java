package Java.GCT;

import java.util.Scanner;

public class q36 {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 3 sides of triangle");
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();
	double s = (a+b+c)/2.0;
	double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
	System.out.println("Area: "+area);
	sc.close();
}
}
