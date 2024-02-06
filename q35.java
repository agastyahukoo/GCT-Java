package Java.GCT;
import java.util.Scanner;
public class q35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius and height");
		double r = sc.nextDouble();
		double h =sc.nextDouble();
		double volume = (1.0/3.0)*3.141*r*r*h;
		System.out.println("Volume: "+ volume);
		sc.close();
	}

}
