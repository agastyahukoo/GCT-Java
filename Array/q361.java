package Array;

import java.util.Scanner;

public class q361 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter 10 numbers: ");
        boolean isAscending = true;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                isAscending = false;
                break;
            }
        }
        if(isAscending)
        {
            System.out.println("The numbers are in ascending order.");
        }
        else
        {
            System.out.println("The numbers are not in ascending order.");
        }
        sc.close();
    }
}
