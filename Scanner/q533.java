package Scanner;

import java.util.Scanner;

public class q533 {

    static String reverseWord(String s)
    {
        String x = "";
        for(int i =s.length()-1;i>=0;i--)
        {
            x +=s.charAt(i);
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();
        s+=" ";
        String word ="";
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(!Character.isWhitespace(c))
            {
                word+=c;
            }
            else
            {
                System.out.println(reverseWord(word));
                word="";
            }
        }
        sc.close();
    }
}
