package Array;

import java.util.Scanner;

public class q375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = new String[10];
        System.out.println("Enter 10 names.");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.next();
        }
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+"\t");
        }
        sc.close();
    }
}
