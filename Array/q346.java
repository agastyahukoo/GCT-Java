package Array;

import java.util.Scanner;

public class q346 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int[] a = new int[10];
        for(int i = 0;i<a.length;i++)
        {
                a[i]=sc.nextInt();
        }
        for(int i = a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+"\t");
        }
        sc.close();
    }
}
