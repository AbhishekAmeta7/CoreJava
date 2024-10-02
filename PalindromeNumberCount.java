import java.util.Scanner;

public class PalindromeNumberCount {
    
    public static void countPalindrome(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int ans = 0,p = 0;
            int x=arr[i];
            while(x>0){
                p = x%10;
                ans = ans*10+p;
                x/=10;
            }
            if(ans==arr[i]){
                count++;
            }
        }
        System.out.println("Total Palindrome Number In Array: "+count);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        countPalindrome(a);
    }
}
