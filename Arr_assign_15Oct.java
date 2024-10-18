import java.util.Arrays;
import java.util.Scanner;
public class Arr_assign_15Oct{
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            Arrays.sort(a);
            System.out.print(a[i]+" ");
        }
    }
    public static void square(int[] a) {
        int sqr[] = new int[a.length]; 
        for (int i = 0; i < a.length; i++) {
            sqr[i] = a[i]*a[i];
        }
        printArray(sqr);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        square(a);
    }
}
// user input : 
// positive integer and negative integer 

// square 
// sort 