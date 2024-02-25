package Array;

import java.util.Scanner;

public class q365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 letters.");
        char[] a = new char[10];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.next().charAt(0);
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print((int)a[i]+"\t");
        }
        sc.close();
    }
}
