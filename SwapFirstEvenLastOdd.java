import java.util.Scanner;
public class SwapFirstEvenLastOdd {
    public static void printArray(int [] a){
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void travers(int a[]){
        for(int i = 0; i < a.length; i++){
            int left = 0,x=0,y=0;
            int right = a.length-1;
            while(left<=right){
            if(a[left]%2==0){
                x = left;
            }
            else{
                left++;
            }
            if(a[right]%2 != 0){
                y = right;
            }
            else{
                right--;
            }
            if(a[left]%2==0 && a[right]%2 != 0){
                swap(a,left,right);
                left++;
                right--;
            }
        }
        }
        printArray(a);
    }
    public static void swap(int a[] , int i ,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size OF Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        travers(a);
    }
}