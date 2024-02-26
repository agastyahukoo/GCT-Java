package Array;

import java.util.Scanner;

public class q373 {

   static boolean isVowel(char c)
    {
        c = Character.toUpperCase(c);
        if(c == 'A' || c == 'E' || c=='I' || c=='O' || c=='U')
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 names.");
        String[] a = new String[10];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.next();
        }
        for(int i=0;i<a.length;i++)
        {
            if(isVowel(a[i].charAt(0)))
            {
                System.out.print(a[i]+"\t");
            }
        }
        sc.close();
    }
}
