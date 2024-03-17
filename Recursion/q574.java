package Recursion;

import java.util.Scanner;

public class q574 {
    int n;
    q574()
    {
        n=0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        printOdd(n);
        sc.close();
    }
    void printOdd(int n)
    {
        if(n!=0 && (n%10)%2!=0)
        {
            System.out.print(n%10);
            printOdd(n/10);
        }
    }
    public static void main(String[] args) {
        q574 obj = new q574();
        obj.input();
    }
}
