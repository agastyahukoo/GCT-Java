package Scanner;

import java.util.Scanner;

public class q534 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence and a word to search.");
        String s = sc.nextLine();
        s+=" ";
        String search = sc.next();
        String word="";
        boolean foundword= false;
        for(int i=0;i<s.length();i++)
        {
            char x = s.charAt(i);
            if(!Character.isWhitespace(x))
            {
                word+=x;
            }
            else
            {
                if(word.equalsIgnoreCase(search))
                {
                    foundword=true;
                    break;
                }
                word="";
            }
        }
        if(foundword)
        {
            System.out.println("The word was found in the sentence.");
        }
        else
        {
            System.out.println("The word was not found in the sentence.");
        }
        sc.close();
    }
}
