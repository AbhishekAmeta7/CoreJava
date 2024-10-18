import java.util.Scanner;
public class Sort_CharArray {
    public static void printArray(char[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void sortChar(char[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
                    swap(a,i,j);
                }   
            }
        }
        printArray(a);
    }
    public static void swap(char[] a, int i , int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        char a[] = new char[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next().charAt(0);
        }
        sortChar(a);
    }
}
