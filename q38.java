package Java.GCT;

import java.util.Scanner;

public class q38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter Amount in Rupees.");
double rupees = sc.nextDouble();
double paise = rupees*100.0;
System.out.println("Amount in paise: "+paise);
sc.close();
	}

}
