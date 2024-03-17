package Recursion;

import java.util.Scanner;

public class q572 {
        int n;
    q572()
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
    int sumOfEvenDigits(int n)
    {
        if(n==0)
            return 0;
        else if((n%10)%2==0)
            return n%10+sumOfEvenDigits(n/10);
        else
            return 0+sumOfEvenDigits(n/10);
    }
    void display()
    {
        System.out.println("The sum of even digits in the number "+n+" is: "+sumOfEvenDigits(n));
    }
    public static void main(String[] args)
    {
        q572 obj = new q572();
        obj.input();
        obj.display();
    }
}
