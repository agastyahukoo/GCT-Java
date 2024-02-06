package Java.GCT;
import java.util.Scanner;

public class q34 {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Period and Time to find SI");
	double P = sc.nextDouble();
	double T = sc.nextDouble();
	double SI = P*T*0.06;
	System.out.println("Simple Interest: "+SI);
	sc.close();
}
}
