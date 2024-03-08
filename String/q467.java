package String;

import java.util.Scanner;

public class q467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        int counta=0; int counte=0; int counti=0; int counto=0; int countu=0;
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                counta++;
            }
            else if(s.charAt(i)=='e')
            {
                counte++;
            }
            else if(s.charAt(i)=='i')
            {
                counti++;
            }
            else if(s.charAt(i)=='o')
            {
                counto++;
            }
            else if(s.charAt(i)=='u')
            {
                countu++;
            }
        }
        System.out.println("A: "+ counta);
        System.out.println("E: "+ counte);
        System.out.println("I: "+ counti);
        System.out.println("O: "+ counto);
        System.out.println("U: "+ countu);
        sc.close();
    }
}
