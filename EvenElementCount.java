import java.util.*;
public class EvenElementCount {
    public static void printArray(int[]a){
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                count++;
            }
        }
        System.out.println("Total Even Elements in Array: "+count);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        printArray(a);
    }
}