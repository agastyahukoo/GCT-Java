package Java.GCT;
import java.util.Scanner;
public class q29 {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Amount to convert");	
	double usd =sc.nextDouble();
	double inr= usd*87.68;
	System.out.println(usd+ " USD = "+inr+ " INR");
	sc.close();
}
}
