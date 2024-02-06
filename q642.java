package Java.GCT;
import java.util.*;

public class q642 {
    int[][] a;
  Scanner sc = new Scanner(System.in);
    q642() {
        a = new int[3][3];
    }

    q642(int size) {
        a = new int[size][size];
    }

    void input() {
        System.out.println("Enter " + a.length * a.length + " elements.");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void add(q642 obj1) {
        for (int i = 0; i < obj1.a.length; i++) {
            for (int j = 0; j < obj1.a.length; j++) {
                this.a[i][j] += obj1.a[i][j];
            }
        }
    }

    q642 add(q642 obj1, q642 obj2) {
        q642 result = new q642(obj1.a.length);
        for (int i = 0; i < obj1.a.length; i++) {
            for (int j = 0; j < obj1.a.length; j++) {
                result.a[i][j] = obj1.a[i][j] + obj2.a[i][j];
            }
        }
        return result;
    }

    q642 multiply(q642 obj1, q642 obj2) {
        int rowsA = obj1.a.length;
        q642 result = new q642(rowsA);

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < rowsA; j++) {
                for (int k = 0; k < rowsA; k++) {
                    result.a[i][j] += obj1.a[i][k] * obj2.a[k][j];
                }
            }
        }
        return result;
    }

    void transpose(q642 obj1) {
        for (int i = 0; i < obj1.a.length; i++) {
            for (int j = 0; j < obj1.a.length; j++) {
                this.a[i][j] = obj1.a[j][i];
            }
        }
    }

    public static void main(String[] args) {
        q642 obj1 = new q642(2);
        q642 obj2 = new q642(2);
        obj1.input();
        obj2.input();
        obj1.add(obj2);
        obj1.display();
        q642 result = obj1.multiply(obj1, obj2);
        result.display();
        result.transpose(obj1);
        result.display();
        
    }
}
