package Array;

import java.util.Scanner;

public class q353 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int[] a = new int[10];
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>99 && a[i]<1000)
            {
                sum+=a[i];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
