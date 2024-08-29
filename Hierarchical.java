class A{
    A(){
        System.out.println("A Constructor");
    }
    A(int a){
        System.out.println("Number: "+a);
    }
}
class B extends A{
    B(){
        System.out.println("B Constructor");
    }
    B(int a){
        System.out.println("Square Of "+a+" :"+(a*a));
    }
}
class C extends A{
    C(){
        System.out.println("C Constructor");
    }
    C(int a,int b){
        System.out.println("Multiply: "+(a*b));
    }
}
public class Hierarchical{
    public static void main(String[] args) {
        new B();
        new B(4);
        new C();
        new C(3, 9);
    }
}
/*heirarichal inheritance :constructor overlaoding*/