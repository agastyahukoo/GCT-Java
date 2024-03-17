package Recursion;

import java.util.Scanner;

public class q571 {
    int n;
    q571()
    {
        n=0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        n= sc.nextInt();
        sc.close();
    }
    int countOdd(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if((n%10)%2!=0)
        {
            return 1+ countOdd(n/10);
        }
        else 
            return 0+countOdd(n/10);
    }
    void display()
    {
        System.out.println("Number of odd Digits: "+countOdd(n));
    }
    public static void main(String[] args) {
        q571 obj = new q571();
        obj.input();
        obj.display();
    }
}
