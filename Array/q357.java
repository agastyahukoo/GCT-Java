package Array;

import java.util.Scanner;

public class q357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int count=0;
        System.out.println("Enter 10 numbers: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==25)
            {
                count++;
            }
        }
        System.out.println("The number of times 25 occurs: "+count);
        sc.close();
    }
}
