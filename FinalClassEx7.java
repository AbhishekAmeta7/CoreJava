final class A{
    int add(int a,int b){
        return a+b;
    }
}
public class FinalClassEx7 {
    public static void main(String[] args) {
        A d = new A();
        System.out.println(d.add(9, 16));
    }
}
//12)class final and non final method return type int add(paramter)