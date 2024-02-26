package Array;

import java.util.Scanner;

public class q374 {
    public static void main(String[] args) {
        String[] states = {"Maharashtra","Gujrat","Rajesthan","Kerela","Tamil Nadu","Andhra Pradesh","Karnataka","Telangana","West Bengal","Punjab"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a state: ");
        boolean exists = false;
        String a = sc.next();
        for(int i =0;i<states.length;i++)
        {
            if(a.equalsIgnoreCase(states[i]))
            {
                exists = true;
            }
        }
        if(exists)
        {
            System.out.println("The state exists in the array.");
        }
        else
        {
            System.out.println("The state does not exist in the array.");
        }
        sc.close();
    }
}
