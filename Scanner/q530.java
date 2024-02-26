package Scanner;

import java.util.Scanner;

public class q530 {
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
                System.out.println(word+" , Length: "+word.length());
                word="";
            }
        }
        sc.close();
    }
}
