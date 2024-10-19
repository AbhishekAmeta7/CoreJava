import java.util.*;
public class SumOf_2D {
    public static void sum(int[][] a) {
        int sum= 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum = sum+a[i][j]; 
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr Size Of 2D Array: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter Elements: ");
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        sum(a);
    }
}
