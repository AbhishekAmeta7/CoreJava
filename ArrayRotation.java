import java.util.*;
public class ArrayRotation {
    public static void roted(int a[]){
        int mid = a.length/2;
        for(int i = mid; i < a.length; i++ ){
            System.out.print(a[i]+" ");
        }
        for(int i = 0; i<mid;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size OF Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        roted(a);
    }
}
// input array :
// 1,2,3,4,5

// number :3 
// 3,4,5,1,2 