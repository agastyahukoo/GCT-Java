package Java.GCT;

import java.util.Scanner;

public class q479 {
String sentence="";
int count=0;
char x;
String word="";
void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a sentence.");
sentence = sc.nextLine();
sc.close();
}
void count()
{
for(int i=0;i<sentence.length();i++)
{
	x= sentence.charAt(i);
	if(!Character.isWhitespace(x))
	{
		word+=x;	
	}
	else
	{
		word="";
		count++;
	}
	}
}
void display()
{
System.out.println("The number of words present are: "+count);	
}
	public static void main(String[] args) {
	q479 obj = new q479();
			obj.input();
	obj.count();
	obj.display();

	}

}
