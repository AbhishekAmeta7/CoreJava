import java.util.Scanner;
public class Sum_Of_Column {
    public static void sumOfColumn(int a[][]) {
        int row = a.length;
        int col = a[0].length;
        for (int i = 0; i < col; i++) {
            int sum = 0;
            for (int j = 0; j < row; j++) {
                sum += a[j][i]; 
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NO. of Rows and Columns: ");
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("--------------X--------------");
        sumOfColumn(a);
    }
}
