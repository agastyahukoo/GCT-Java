package Array;

import java.util.Scanner;

public class q360 {
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
        boolean exists = false;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==num)
            {
                exists=true;
                System.out.println("The number "+num+" exists at the "+i+" index in the array.");
            }
        }
        if(!exists)
        {
            System.out.println("The number "+num+" does not exist in the array");
        }
        sc.close();
    }
}
