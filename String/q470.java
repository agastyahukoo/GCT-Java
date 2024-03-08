package String;

import java.util.Scanner;

public class q470 {
    static boolean isPalindrome(String s)
    {
        s=s.trim();
        String r = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            r+=s.charAt(i);
        }
        if(s.equalsIgnoreCase(r))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();
        if(isPalindrome(s))
        {
            System.out.println("The word is a palindrome.");
        }
        else
        {
            System.out.println("The word is not a palindrome.");
        }
        sc.close();
    }
}
