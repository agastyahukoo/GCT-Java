package Array;

import java.util.Scanner;

public class q352 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int[] a = new int[10];
        for(int i =0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%10==9)
            {
                System.out.print(a[i]+"\t");
            }
        }
        sc.close();
    }
}
