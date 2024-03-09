package Array;

import java.util.Scanner;

public class q376 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter a number to search.");
        int nums = sc.nextInt();
        int low=0;
        int high = a.length-1;
        int mid = 0;
        while (low<=high) {
            mid = ((high+low)/2);
            if(a[mid]==nums)
            {
                break;
            }
            if(nums < a[mid])
            {
                high = mid-1;
            }
            else
            {
                low = mid +1;
            }
        }
        if(mid!=-1)
        {
            System.out.println("The number was found at: "+(mid+1));
        }
        else
        {
            System.out.println("The number was not found.");
        }
        sc.close();
    }
}
