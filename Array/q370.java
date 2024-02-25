package Array;

import java.util.Scanner;

public class q370 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 cities:");
        String[] s = new String[10];
        for(int i=0;i<s.length;i++)
        {
            s[i]=sc.next();
        }
        for(int i=0;i<s.length;i++)
        {
            if(s[i].charAt(0)=='A')
            {
                System.out.print(s[i]+"\t");
            }
        }
        sc.close();
    }
}
