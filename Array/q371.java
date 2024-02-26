package Array;

import java.util.Scanner;

public class q371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = new String[10];
        System.out.println("Enter 10 Names");
        for(int i =0;i<a.length;i++)
        {
            a[i]=sc.next();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i].length()>=5)
            {
                System.out.print(a[i]+"\t");
            }
        }
        sc.close();
    }
}
