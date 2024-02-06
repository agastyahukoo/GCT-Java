        package Java.GCT;

        import java.util.Scanner;
            
        public class q461 {
            int a[][];
                int left;
                int right;
                int top;
                int bottom;
                Scanner sc = new Scanner(System.in);
            void input()
            {
                System.out.println("Enter dimensions of the array.");
                int n = sc.nextInt();
                a = new int[n][n];
                left =0;
                right = a.length-1;
                top =0;
                bottom = a.length-1;
                
            }
            void spiral()
            {
                Scanner sc = new Scanner(System.in);
                while (top <= bottom && left <= right) {
                    // Traverse from left to right
                    for (int i = left; i <= right; i++) {
                        a[top][i] = sc.nextInt();
                    }
                    top++;

                    // Traverse downwards
                    for (int i = top; i <= bottom; i++) {
                        a[i][right] = sc.nextInt();
                    }
                    right--;

                    // Traverse from right to left
                    if (top <= bottom) {
                        for (int i = right; i >= left; i--) {
                            a[bottom][i] = sc.nextInt();
                        }
                        bottom--;
                    }

                    // Traverse upwards
                    if (left <= right) {
                        for (int i = bottom; i >= top; i--) {
                            a[i][left] = sc.nextInt();
                        }
                        left++;
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
                sc.close();
            }
            public static void main(String[] args)
            {
                q461 obj = new q461();
                obj.input();
                obj.spiral();
            }

        }
