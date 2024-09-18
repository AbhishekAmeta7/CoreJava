import java.util.Scanner;

final class A{
    final void print(int a){
        System.out.println(a);
    }
}
public class FinalClassFinalMethod1 {
    public static void main(String[] args) {
        A ob = new A();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a = sc.nextInt();
        ob.print(a);
    }
}
//3)class final and method final (paramter) :output