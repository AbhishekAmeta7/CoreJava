import java.util.Scanner;

public class StoredEvenNumIndex {
    public static void printStoredEvenIndex(int a[]){
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                System.out.print(i+" ");
            }
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
        printStoredEvenIndex(a);
    }
}
