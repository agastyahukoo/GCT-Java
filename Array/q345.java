package Array;

import java.util.Scanner;

public class q345 {
    public static void main(String[] args)
    {
        int[] a = {5, 15, 10, 25, 45, 30, 40, 25, 10, 5};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        for(int i = 0;i<a.length;i++)
        {
            if(a[i]==num)
            {
                count++;
            }
        }
        System.out.println("Number of times the number "+num+" occurs: "+count);
        sc.close();
    }
}
