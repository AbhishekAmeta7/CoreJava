final class A{
    final void show(){
        System.out.println("final method show inside final class A");
    }
    final void show1(){
        System.out.println("final method show1 inside final class A");
    }
    final void show2(){
        System.out.println("final method show2 inside final class A");
    }
    final void show3(){
        System.out.println("final method show3 inside final class A");
    }
}
public class FinalClassMultiFinalMethod {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        a.show1();
        a.show2();
        a.show3();
    }
}
/*13)class final and method final 
can we use mulitple final in a single class 
show() 
show1() 
show2() 
show3()*/