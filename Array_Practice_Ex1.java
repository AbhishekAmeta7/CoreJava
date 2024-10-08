import java.util.Scanner;

public class Array_Practice_Ex1 {
    public static void printArray(int []a){
        int mid = (0 + (a.length-1))/2;
        for(int i = mid; i >=0; i--){
            System.out.print(a[i]+" ");
        }
        for(int i = mid+1; i <= a.length-1 ; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        printArray(a);
    }
}
