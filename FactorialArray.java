import java.util.*;
public class FactorialArray {
    public static void factorial(int a[]){
        for (int i = 0; i < a.length; i++) {
            int fact = 1;
            for(int j = a[i];j>=1;j--){
                fact=fact*j;
            }
            System.out.print(fact+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        factorial(a);
    }
}
