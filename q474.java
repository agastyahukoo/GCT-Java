package Java.GCT;

import java.util.Scanner;

public class q474 {
String sentence="";
char x;
String newsentence="";
void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter sentence.");
sentence = sc.nextLine();
sc.close();
}
void remove()
{
	for(int i=0;i<sentence.length();i++)
	{
		x = sentence.charAt(i);
		if(x == 'A' || x == 'a' ||x == 'E' ||x == 'e' ||x == 'I' ||x == 'i' ||x == 'O' ||x == 'o' ||x == 'U' ||x == 'u')
		{
			
		}
		else
		{
			newsentence+=x;
		}
	}
}
void display()
{
	System.out.println(newsentence);
}
	public static void main(String[] args) {
		q474 obj = new q474();
		obj.input();
		obj.remove();
		obj.display();

	}

}
