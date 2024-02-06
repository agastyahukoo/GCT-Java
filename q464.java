package Java.GCT;

import java.util.Scanner;

public class q464 {
      String input="";
      int length = 0;
      void input()
      {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter a string.");
    	  input = sc.nextLine();
    	  sc.close();
      }
      void findlength()
      {
    	  length = input.length();
    	  System.out.println("The length of the string is "+length);
      }
      
	public static void main(String[] args) {
		q464 obj = new q464();
		obj.input();
		obj.findlength();

	}

}
