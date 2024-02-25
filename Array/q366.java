package Array;

import java.util.Scanner;

public class q366 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 letters.");
        char[] a = new char[10];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.next().charAt(0);
        }
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+= (int) a[i];
        }
        System.out.println("Sum of ASCII/Unicode codes of each digits: "+sum);
        sc.close();
    }
}
