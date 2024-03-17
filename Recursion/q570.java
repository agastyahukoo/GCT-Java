package Recursion;

import java.util.Scanner;

public class q570 {
    int n;
    q570()
    {
        n = 0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        sc.close();
    }
    int sumOfDigits(int n)
    {
        if(n==0)
            return 0;
        else
            return n%10+sumOfDigits(n/10);
    }
    void display()
    {
        System.out.println("The sum of digits in the number "+n+" is: "+sumOfDigits(n));
    }
    public static void main(String[] args) {
        q570 obj = new q570();
        obj.input();
        obj.display();
    }
}
