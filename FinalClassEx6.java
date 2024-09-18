final class A{
    int addition(){
        int a = 90,b=60;
        return a+b;
    }
}
public class FinalClassEx6 {
    public static void main(String[] args) {
        A c = new A();
        System.out.println(c.addition());
    }
}
//11)class final and non final method return type int addition (non paramter)