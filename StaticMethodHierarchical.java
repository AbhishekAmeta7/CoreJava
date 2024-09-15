class A{
    static void display(){
        System.out.println("static method display in class A");
    }
}
class B extends A{
    static void display1(){
        System.out.println("static method display1 in class B");
    }
}
class C extends A{
    static void display2(){
        System.out.println("static method display2 in class C");
    }
}
public class StaticMethodHierarchical {
    public static void main(String[] args) {
        B.display();
        B.display1();
        C.display2();
    }
}
//static method heirarichal inheritance