package String;

import java.util.Scanner;

public class q464 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            count++;
        }
        System.out.println("Length of String: "+count);
        sc.close();
    }
}
