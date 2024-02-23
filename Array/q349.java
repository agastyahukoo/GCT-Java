package Array;

import java.util.Scanner;

public class q349 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int[] a = new int[10];
        int count=0;
        for(int i = 0;i<a.length;i++)
        {
                a[i]=sc.nextInt();
        }
        for(int i = 0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                count++;
            }
        }
        System.out.println("Number of Even Numbers: "+count);
        System.out.println("Number of Odd Numbers: "+(a.length-count));
        sc.close();
    }
}
