package Array;

import java.util.Scanner;

public class q356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter 10 numbers: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<0)
            {
                System.out.print(a[i]+"\t");
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                System.out.print(a[i]+"\t");
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                System.out.print(a[i]+"\t");
            }
        }
        sc.close();
    }
}
