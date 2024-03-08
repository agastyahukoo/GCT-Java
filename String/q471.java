package String;

import java.util.Scanner;

public class q471 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        boolean isLowerCase = true;
        boolean isUpperCase = false;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLowerCase(s.charAt(i)) && isLowerCase)
            {
                System.out.print(s.charAt(i)+ "\t");
            }
            else if(Character.isUpperCase(s.charAt(i)) && isUpperCase)
            {
                System.out.print(s.charAt(i)+ "\t");
            }
            else if(Character.isDigit(s.charAt(i)) && !isLowerCase && !isUpperCase)
            {
                System.out.print(s.charAt(i)+ "\t");
            }
            if(i==s.length()-1 && isLowerCase)
            {
                isLowerCase = false;
                isUpperCase = true;
                i=0;
            }
            else if(i==s.length()-1 && isUpperCase)
            {
                isUpperCase=false;
                i=0;
            }
        }
        sc.close();
    }
}
