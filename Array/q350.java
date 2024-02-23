package Array;

import java.util.Scanner;

public class q350 {
    public static void main(String[] args)
       {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int[] a = new int[10];
        int countnegative=0;
        int countpositive=0;
        for(int i = 0;i<a.length;i++)
        {
                a[i]=sc.nextInt();
        }
        for(int i = 0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                countpositive++;
            }
            else if(a[i]<0)
            {
                countnegative++;
            }
        }
        System.out.println("Number of Positive Numbers: "+countpositive);
        System.out.println("Number of Negative Numbers: "+ countnegative);
        System.out.println("Number of 0s: "+(a.length-(countnegative+countpositive)));
        sc.close();
    }
}
