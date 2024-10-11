import java.util.*;
public class MaxTwoArray1 {
    public static void printArray(int[] a , int []b) {
        int c = 0,d=0;
        for (int i = 0; i < a.length; i++) {
            int ans = 0,x=a[i];
            while(x>0){
                int p = x%10;
                ans=ans+p*p*p;
                x/=10;
            }
            if(a[i]==ans){
                c=a[i];
            }
        }
        
        for (int i = 0; i < b.length; i++) {
            int ans = 0,x=b[i];
            while(x>0){
                int p = x%10;
                ans=ans*10+p;
                x/=10;
            }
            if(b[i]==ans){
                d=b[i];
            }
        }
        if(c>d){
            System.out.println("Armstrong is Greater");
        }
        else{
            System.out.println("Palindrome is Greater");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array1: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter Size Of Array2: ");
        int n1 = sc.nextInt();
        int b[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            b[i] = sc.nextInt();
        }
        printArray(a,b);
    }
}