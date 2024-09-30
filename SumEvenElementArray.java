import java.util.Scanner;

public class SumEvenElementArray {
     public static void printSumEvenArray(int[]a){
        int sum=0;
        for(int i = 0;i<a.length;i++){
            if(a[i]%2==0){
                sum+=a[i];
            }
        }
        System.out.print("Sum Of Even Element: "+sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        printSumEvenArray(a);
    }
}
