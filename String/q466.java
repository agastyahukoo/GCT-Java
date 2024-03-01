package String;

import java.util.Scanner;

public class q466 {
        static boolean isVowel(char c)
        {
            c=Character.toUpperCase(c);
            if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            {
                return true;
            }
            return false;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(isVowel(s.charAt(i)))
            {
                count++;
            }
        }
        System.out.println("Number of Vowels: "+count);
        sc.close();
    }
}
