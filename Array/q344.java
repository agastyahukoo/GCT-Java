package Array;

public class q344 {
    public static void main(String[] args)
    {
        int[] a = {5, 15, 10, 25, 45, 30, 40, 25, 10, 5};
        int count=0;
        for(int i = 0;i<a.length;i++)
        {
            if(a[i]==25)
            {
                count++;
            }
        }
        System.out.println("Number of times the number '25' occurs: "+count);
    }
}
