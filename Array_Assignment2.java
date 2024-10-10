import java.util.Scanner;

public class Array_Assignment2 {
    public static int printArray(int a[]){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>12){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Count: "+printArray(a));
    }
}
