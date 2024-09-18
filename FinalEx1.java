import java.util.*;
final class A{
    final void add(int a,int b){
        System.out.println("Add: "+(a+b));
    }
    final void add1(int a,int b){
        System.out.println("Add1: "+(a+b));
    }
}
public class FinalEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A k = new A();
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        k.add1(a, b);
        k.add(70, 30);
    }
}
/*4)class final and method final addition (void)
a)constant 
b)user input */