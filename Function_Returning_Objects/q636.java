package Function_Returning_Objects;

import java.util.Scanner;

public class q636 {
    int hour;
    int minute;
    int second;
    static Scanner sc =new Scanner(System.in);
    q636()
    {
        hour =  minute = second = 0;
    }
    void input()
    {
        System.out.println("Enter hours, minutes and seconds.");
        hour = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();
        sc.close();
    }
    void display()
    {
        System.out.println("Time: "+hour+ ":" + minute+ ":" + second);
    }
    void add(q636 obj)
    {
        q636 temp = new q636();
        temp.input();
        int total = temp.hour*3600 + this.hour*3600 + temp.minute*60 + this.minute*60 + temp.second + this.second;
        this.hour = total/3600;
        total %=3600;
        this.minute = total/60;
        this.second = total%60;
    }
    q636 add(q636 obj1, q636 obj2)
    {
        q636 temp = new q636();
        int total = obj1.hour*3600 + obj2.hour*3600 + obj1.minute*60 + obj2.minute*60 + obj1.second + obj2.second;
        temp.hour = total/3600;
        total %=3600;
        temp.minute = total/60;
        temp.second = total%60;
        return temp;
    }
    public static void main(String[] args) {
        System.out.println("");
        q636 obj1 = new q636();
        q636 obj2 = new q636();
        obj1.input();
        obj2.input();
        obj2 = obj1.add(obj1, obj2);
        obj2.display();
        sc.close();
    }
}
