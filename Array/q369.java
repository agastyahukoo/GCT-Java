package Array;

public class q369 {
    public static void main(String[] args) {
        String[] names = {"Jensen", "Elon", "Lisa" };
        int[] age = {61, 52, 54};
        for(int i=0;i<age.length;i++)
        {
            if(age[i]>54)
            {
                System.out.println("Name: "+names[i]);
                System.out.println("Age: "+age[i]);
            }
        }
    }
}
