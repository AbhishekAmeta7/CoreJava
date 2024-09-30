import java.util.*;
public class ArrayPrintMethod{
    public static void printArray(int[]a){
        System.out.println("Addition Of First and Last Element: "+(a[0]+a[a.length-1]));
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
// array user input :

// all questions through method :

// first element and last element addition