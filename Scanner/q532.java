package Scanner;

import java.util.Scanner;

public class q532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();
        s+=" ";
        String word ="";
        String longestword="";
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(!Character.isWhitespace(c))
            {
                word+=c;
            }
            else
            {
                if(word.length()>longestword.length())
                {
                    longestword = word;
                }
                word="";
            }
        }
        System.out.println("The longest word is: "+longestword);
        sc.close();
    }
}
