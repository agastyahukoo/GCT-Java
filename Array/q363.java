package Array;

import java.util.Scanner;

public class q363 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = new char[10];
        System.out.println("Enter 10 characters.");
        for(int i=0;i<a.length;i++)
        {
            a[i] = Character.toUpperCase(sc.next().charAt(0));
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");
        }
        sc.close();
    }
}
