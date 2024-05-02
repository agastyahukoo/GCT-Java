package DD_Array;

import java.util.Scanner;

public class q422 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 numbers.");
        int[][] a = new int[3][3];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
