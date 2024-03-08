package String;

import java.util.Scanner;

public class q469 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        String r = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            r+=s.charAt(i);
        }
        System.out.println("Reverse of the String: "+r);
        sc.close();
    }
}
