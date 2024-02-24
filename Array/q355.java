package Array;

import java.util.Scanner;

public class q355 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[10];
        System.out.println("Enter 10 numbers.");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        boolean printOdd = true;
        for(int i=0;i<a.length;i++)
        {
            if(printOdd && a[i]%2!=0)
            {
                System.out.print(a[i]+"\t");
            }
            else if(!printOdd && a[i]%2==0)
            {
                System.out.print(a[i]+"\t");
            }
            if((i==a.length-1) && printOdd)
            {
                printOdd = false;
                i=0;
            }
        }
        sc.close();
    }
}
