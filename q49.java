package Java.GCT;

import java.util.Scanner;

public class q49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter age");
int age = sc.nextInt();
if(age<14)
{
	System.out.println("You are a child");	
}
else if(age>14 && age<18)
{
	System.out.println("You are a teen");	
}
else if(age>=18)
{
	System.out.println("You are an adult");	
}
sc.close();
	}

}
