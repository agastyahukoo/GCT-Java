package Array;

public class q341 {
    public static void main(String[] args)
    {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum=0;
        for(int i = 0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                sum+=a[i];
            }
        }
        System.out.print(sum);
    }
}
