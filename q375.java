	package Java.GCT;

	import java.util.Scanner;

	public class q375 {
	String[] arr = new String[10];
	void input()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 10 words.");
	for(int i=0;i<arr.length;i++)
	{
	arr[i]=sc.next();	
	}
	sc.close();
	}
	void print()
	{
	for(int i=0;i<arr.length;i++)
	{
		String s = arr[i];
	for(int j = s.length()-1;j>=0;j--)
	{
	char x = s.charAt(i);
	System.out.print(x);	
	}
	System.out.print(" ");
	}
	}
	public static void main(String[] args)
	{
	q375 obj = new q375();
	obj.input();
	obj.print();
	}
	}
