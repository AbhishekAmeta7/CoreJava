import java.util.Scanner;

public class FindPerfectArray {
    public static void printPerfext(int a[]){
        for (int i = 0; i < a.length; i++) {
            int x = 1,ans=0;
            while(x<a[i]){
                if(a[i]%x==0){
                    ans=ans+x;
                }
                x++;
            }
            if(a[i]==ans){
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
        printPerfext(a);
    }
}