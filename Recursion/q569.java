package Recursion;

import java.util.Scanner;

public class q569 {
    int n;
    q569()
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
    int countDigits(int n)
    {
        if(n==0)
            return 0;
        else
            return 1+countDigits(n/10);
    }
    void display()
    {
        System.out.println("The number "+n+" has "+countDigits(n)+" digits.");
    }
    public static void main(String[] args) {
        q569 obj = new q569();
        obj.input();
        obj.display();
    }
}
