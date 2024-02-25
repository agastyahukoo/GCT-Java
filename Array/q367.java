package Array;

import java.util.Scanner;

public class q367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = {"George","Jensen","Elon","Lisa"};
        System.out.println("Enter a name to search.");
        String search = sc.next();
        boolean exists = false;
        for(int i=0;i<a.length;i++)
        {
            if(a[i].equalsIgnoreCase(search))
            {
                exists = true;
            }
        }
        if(exists)
        {
            System.out.println("The name exists.");
        }
        else
        {
            System.out.println("The name does not exist.");
        }
        sc.close();
    }
}
