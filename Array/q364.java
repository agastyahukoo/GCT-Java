package Array;

import java.util.Scanner;

public class q364 {
    static boolean isVowel(char c)
    {
        c = Character.toUpperCase(c);
        if(c == 'A' || c=='E' || c== 'I' || c=='O' || c=='U')
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 letters.");
        char[] a = new char[10];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.next().charAt(0);
        }
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(isVowel(a[i]))
            {
                count++;
            }
        }
        System.out.println("Number of vowels: "+count);
        sc.close();
    }
}
