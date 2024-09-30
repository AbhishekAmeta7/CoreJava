import java.util.Scanner;

public class SumArrayMethod {
    public static void printArray(int[]a){
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("Sum: "+sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        printArray(a);
    }
}
// sum of all array elements in java 