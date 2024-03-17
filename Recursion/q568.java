package Recursion;

import java.util.Scanner;

public class q568 {
    int n;
    q568()
    {
        n=0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        n = sc.nextInt();
        sc.close();
    }
    int Factorial(int n)
    {
        if(n==0)
            return 1;
        else
            return n*Factorial(n-1);
    }
    void display()
    {
        System.out.println("The factorial of "+n+" is: "+Factorial(n));
    }
    public static void main(String[] args)
    {
        q568 obj = new q568();
        obj.input();
        obj.display();
    }
}
