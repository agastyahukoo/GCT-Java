package Scanner;

import java.util.Scanner;

public class q531 {

    static int countVowels(String s)
    {
        int count=0;
        s=s.toUpperCase();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            {
                count++;
            }
        }
        return count;
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
                System.out.println("Word: "+word+", Number of Vowels: "+countVowels(word));
                word="";
            }
        }
        sc.close();
    }
}
