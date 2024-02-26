package Scanner;

import java.util.Scanner;

public class q528 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();
        s+=" ";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isWhitespace(c))
            {
                count++;
            }
        }
        System.out.println("Number of words: "+count);
        sc.close();
    }
}
