package Array;

public class q342 {
    public static void main(String[] args)
    {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int counteven=0;
        for(int i = 0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                counteven++;
            }
        }
        System.out.println("Number of Even numbers: "+counteven);
        System.out.println("Number of Odd numbers: "+ (a.length-counteven));
    }
}
