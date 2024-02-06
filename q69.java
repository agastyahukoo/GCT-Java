package Java.GCT;
import java.util.Scanner;
public class q69 {

	public static void main(String[] args) {
		String x = "";
		String rev="";
		Scanner sc = new Scanner(System.in);
		x = sc.next();
		for(int i=x.length()-1;i>=0; i--)
		{
			char s=x.charAt(i);
			rev+=s;
		}
		System.out.println(rev);
		sc.close();
	}

}
