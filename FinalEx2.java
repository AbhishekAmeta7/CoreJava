final class A{
    final void add(int a,int b){
        System.out.println("Add: "+(a+b));
    }
}
public class FinalEx2 {
    public static void main(String[] args) {
        A k = new A();
        k.add(70, 30);
    }
}
//5)class final and method final (paramter) addition(void)