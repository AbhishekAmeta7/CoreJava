import java.util.Scanner;

public class SwapElementArray {
     public static void printSwapArray(int[]a){
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }
    public static void swap(int a[]){
        int temp = a[0];
        a[0] = a[a.length-1];
        a[a.length-1] = temp;
        System.out.println("\nAfter Swapping First and Last Element Array");
        printSwapArray(a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        swap(a);
    }
}
// user input array :
// first element swap last element without method 
// 				with method 