class A{
    static void show(){
        System.out.println("static show method in class  A");
    }
}
class B extends A{
    static void show1(){
        System.out.println("static show1 method in class B");
    }
}
class C extends B{
    static void show2(){
        System.out.println("static show2 method in class C");
    }
}
public class StaticMethodMultilevel {
    public static void main(String[] args) {
        C.show();
        C.show1();
        C.show2();
    }
}
//static method multilevel inheritance