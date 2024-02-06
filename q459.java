package Java.GCT;

public class q459 {
    public static void main(String[] args)
    {
        int a[][] = new int[3][3];
        for(int i=0;i<a.length;i++)
        {
             for(int j=0;j<a.length;j++)
             {
                if(i==j || (i+j)==(a.length-1))
                {
                    a[i][j]= 1;
                }
                else
                {
                a[i][j]= 0;
                }
             }
        }
        for(int i=0;i<a.length;i++)
        {
             for(int j=0;j<a.length;j++)
             {
                System.out.print(a[i][j]+"\t");
             }
             System.out.println();
        }
    }
}
