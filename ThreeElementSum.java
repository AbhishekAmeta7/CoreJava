import java.util.Scanner;
public class ThreeElementSum{
    public static void printArray(int a[],int target){
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                for(int k = j+1; k < a.length; k++){
                    if(a[i]+a[j]+a[k] == target){
                    System.out.println(a[i]+" "+a[j]+" "+a[k]);
                }
                }
            }
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
        System.out.print("Enter Target Element: ");
        int target = sc.nextInt();
        printArray(a,target);
    }
}