package Array;

import java.util.Scanner;

public class q368 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        String[] names = {"Elon", "Jensen","Lisa"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name.");
        String a = sc.next();
        for(int i=0;i<names.length;i++)
        {
            if(a.equalsIgnoreCase(names[i]))
            {
                System.out.println("Name: "+names[i]);
                System.out.println("Number: "+numbers[i]);
                break;
            }
        }
        sc.close();
    }
}
