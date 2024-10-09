import java.util.*;
public class SwapArmstrongArray{
    public static void armstrong(int a[], int fi, int li){
        int ans = 0,ans1 = 0;
         while(fi>0){
            int p = fi%10;
            ans = ans+p*p*p;
            fi/=10;
        }
        while(li>0){
            int p = li%10;
            ans1 = ans1+p*p*p;
            li/=10;
        }
        swap(a,ans,ans1);
    }
    public static void swap(int a[],int ans,int ans1){
        if(ans==a[0] && ans1==a[a.length-1]){
           int temp = a[0];
           a[0] = a[a.length-1];
           a[a.length-1] = temp;
           printArray(a);
        }
        else{
            System.out.println("Not Possible");
        }
    }
    public static void printArray(int a[]){
        for(int i : a){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int fi = a[0];
        int li = a[a.length-1];
        armstrong(a, fi, li);
        
    }
}