import java.util.Scanner;

public class SumFirstLastMiddleArray {
    public static void printArray(int[]a){
        int x=0,y=0;
        if(a.length%2==0){
            x=a[(a.length/2-1)];
            y=a[(a.length/2)];
            System.out.println("Sum Of First Middle Last Element: "+(a[0]+x+y+a[a.length-1]));
        }
        else{
            x=a[(a.length/2)];
            System.out.println("Sum Of First Middle Last Element: "+(a[0]+x+a[a.length-1]));
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
        printArray(a);
    }
}
