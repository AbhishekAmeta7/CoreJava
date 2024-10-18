import java.util.*;
public class Swap_String {
    public static void printArray(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void swap(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        printArray(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        String a[] = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
        int i = 0,j = a.length-1;
        swap(a,i,j);
    }
}