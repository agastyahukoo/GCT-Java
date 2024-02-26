package Array;

import java.util.Scanner;

public class q372 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Names: ");
        String[] a = new String[10];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.next();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i].charAt(0)==a[i].charAt(a[i].length()-1))
            {
                System.out.print(a[i]+ "\t");
            }
        }
        sc.close();
    }
}
