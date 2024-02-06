package Java.GCT;
import java.util.Scanner;

public class q27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter students name");
		String name = sc.nextLine();
		System.out.println("Enter student age");
		int age = sc.nextInt();
		System.out.println("Enter student marks");
		double marks = sc.nextDouble();
		System.out.println("Student Name is "+name);
		System.out.println("Age: "+age);
		System.out.println("Marks: "+marks);
		sc.close();
	}

}
