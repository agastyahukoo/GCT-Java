package Java.GCT;
import java.util.Scanner;
public class q33 {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Temperature in  F");
	double f= sc.nextDouble();
	double c= 5.0/9.0*(f-32);
	System.out.println("Temperature in c: "+ c);
	sc.close();
}
}
