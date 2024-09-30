import java.util.Scanner;

public class FindArmstrongElementArray {
    public static void printArmstrongArray(int[]a){
        for (int i = 0; i < a.length; i++) {
            int p = 0,ans=0,x;
            x=a[i];
            while(x>0){
                p = x%10;
                ans = ans+p*p*p;
                x/=10;
            }
            if(a[i]==ans){
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
        printArmstrongArray(a);
    }
} 