import java.util.Scanner;

public class Minimum2D {
    public static void findMin(int a[][]){
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]<x){
                    x = a[i][j];
                }
            }
        }
        System.out.println("Minimum Element: "+x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. Of Row & Column: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        findMin(a);
    }
}
