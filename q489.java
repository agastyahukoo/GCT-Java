package Java.GCT;

import java.util.Scanner;

public class q489 {
String sentence="";
String word="";
String search="";
int count=0;
char x;

void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Input a sentence.");
sentence=sc.nextLine();
System.out.println("Input a word to search.");
search = sc.next();
sc.close();
}
void search()
{
	for(int i=0;i<sentence.length();i++)
	{
		x = sentence.charAt(i);
		if(!Character.isWhitespace(x))
		{
			word+=x;
		}
		else
		{
			count++;
			if(word.equalsIgnoreCase(search))
			{
		      System.out.println("Word located at: "+ count);
			}
		    word="";
		}
	}
}

	public static void main(String[] args) {
		q489 obj = new q489();
		obj.input();
		obj.search();
	}

}
