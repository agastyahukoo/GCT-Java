package Java.GCT;

import java.util.Scanner;

public class q30 {
public static void main(String[] args)
{
	System.out.println("Enter 3 Sides");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int perimeter = a+b+c;
	System.out.println("Perimeter of the triangle is: "+perimeter);
	sc.close();
}
}
