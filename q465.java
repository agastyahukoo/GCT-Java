	package Java.GCT;

	import java.util.Scanner;

	public class q465 {
	String input="";
	char x;
	void input()
	{
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter String");
	input = sc.nextLine();
	sc.close();	
	}
	void print()
	{
	for(int i=0;i<input.length();i++)
	{
		x = input.charAt(i);
		System.out.println(x);
	}
	}
	public static void main(String[] args)
	{
	q465 obj = new q465();
	obj.input();
	obj.print();
	}
	}
