import java.util.Scanner;

public class OddElementArray {
     public static void printOddArray(int[]a){
        for(int i = 0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.print(a[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        printOddArray(a);
    }
}