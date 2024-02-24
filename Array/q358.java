package Array;

import java.util.Scanner;

public class q358 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int a[] = new int[10];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a number to search.");
        int num = sc.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==num)
            {
                count++;
            }
        }
        System.out.println("The number of times "+num+" occurs: "+count);
        sc.close();
    }
}
