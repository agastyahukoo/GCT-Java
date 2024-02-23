package Array;

public class q343 {
    public static void main(String[] args)
    {
        int[] a = {-4, -3, -2, -1, 0, 1, 2, 3, 4};
        int countpositive=0;
        int countnegative=0;
        for(int i = 0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                countpositive++;
            }
            else if(a[i]<0)
            {
                countnegative++;
            }
        }
        System.out.println("Number of Positive Numbers: "+countpositive);
        System.out.println("Number of Negative Numbers: "+ countnegative);
        System.out.println("Number of 0s: "+(a.length-(countnegative+countpositive)));
    }
}
