import java.util.Scanner;

public class DuplicateElement {
    public static void printArray(int[]a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j]){
                    a[j]=-1;
                }
            }
            if(a[i]>0){
                System.out.print(a[i]+" ");
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
        printArray(a);
    }
}
