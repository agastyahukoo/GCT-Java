package Java.GCT;
import java.util.Scanner;
public class q43 {
	int a;
	int b;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
	}
    void interchange()
    {
    	a = a+b;
    	b = a-b;
    	a = a-b;
    	System.out.println("The value of a is "+a);
    	System.out.println("The value of b is "+b);
    }
	public static void main(String[] args) {
		q43 obj = new q43();
		obj.input();
		obj.interchange();

	}

}
