package Recursion;

import java.util.Scanner;

public class q582 {
    int a, b;
    q582()
    {
        a = b =0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number.");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
    }
    int hcf(int a, int b)
    {
        if(a==0)
            return b;
        else
            return hcf(b%a, a);
    }
    void display()
    {
        System.out.println("The HCF of "+a+" and "+b+" is "+hcf(a, b));
    }
    public static void main(String[] args)
    {
        q582 obj = new q582();
        obj.input();
        obj.display();
    }
}
