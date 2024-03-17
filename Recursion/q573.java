package Recursion;

import java.util.Scanner;

public class q573 {
    int n;
    q573()
    {
        n=0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        sc.close();
    }
    int countDigits(int n)
    {
        if(n==0)
            return 0;
        else if(n%10==5)
            return 1 + countDigits(n/10);
        else
            return countDigits(n/10);
    }
    void display()
    {
        System.out.println("The number 5 occurs: "+ countDigits(n) + " times");
    }
    public static void main(String[] args)
    {
        q573 obj = new q573();
        obj.input();
        obj.display();
    }
}
