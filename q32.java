package Java.GCT;

import java.util.Scanner;

public class q32 {

	public static void main(String[] args) {
		System.out.println("Enter Distance and time");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double t = sc.nextDouble();
		double Velocity = x/t;
		System.out.println("Velocity: "+Velocity);
		sc.close();
	}

}
