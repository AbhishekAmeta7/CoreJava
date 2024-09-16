class A{
    static void display(){
        System.out.println("A class display() method");
    }
}
class B extends A{
    static void display(){
        System.out.println("B class display() method");
    }
}
public class StaticMethodOverride {
    public static void main(String[] args) {
        B.display();
    }
}