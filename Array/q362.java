package Array;

import java.util.Scanner;

public class q362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = new char[10];
        System.out.println("Enter 10 characters.");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextLine().charAt(0);
        }
        boolean isSmall = true;
        for(int i=0;i<a.length;i++)
        {
            if(isSmall && Character.isLowerCase(a[i]))
            {
                System.out.print(a[i]+"\t");
            }
            else if(!isSmall && Character.isUpperCase(a[i])) 
            {
                System.out.print(a[i]+"\t");
            }
            if(isSmall && i==a.length-1)
            {
                isSmall = false;
                i=-1;
            }
        }
        sc.close();
    }
}
