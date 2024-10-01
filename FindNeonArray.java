import java.util.Scanner;

public class FindNeonArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            int ans = a[i]*a[i],x = 0,p=0;
            while (ans>1) {
                p = ans%10;
                x = x+p;
                ans/=10;
            }
            if(a[i]==x){
                System.out.print(a[i]+" ");
            }
        }
    }
}
// user input array : 
// neon number find 