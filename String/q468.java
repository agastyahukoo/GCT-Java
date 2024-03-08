package String;

import java.util.Scanner;

public class q468 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string.");
        String s = sc.next();
        int lowercase=0;
        int uppercase=0;
        int digit=0;
        int specialchar=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                uppercase++;
            }
            else if(Character.isLowerCase(s.charAt(i)))
            {
                lowercase++;
            }
            else if(Character.isDigit(s.charAt(i)))
            {
                digit++;
            }
            else
            {
                specialchar++;
            }
        }
        System.out.println("Number of uppercase characters: "+uppercase);
        System.out.println("Number of lowercase characters: "+lowercase);
        System.out.println("Number of numbers: "+digit);
        System.out.println("Number of special case characters: "+specialchar);
        sc.close();
    }
}
