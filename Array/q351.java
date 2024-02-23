package Array;

import java.util.Scanner;

public class q351 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter 10 numbers.");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%5==0 && a[i]%7==0)
            {
                System.out.println(a[i]+"\t");
            }
        }
        sc.close();
    }
}
