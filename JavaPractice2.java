class A{
    A(int a){
        System.out.println("Class A Constructor: "+a);
    }
}
class B {
    B(int a){
        System.out.println("Class B Constructor: "+a);
    }
}
class C extends A,B{
    C(int a){
        super(10);
        System.out.println("Class C Constructor: "+a);
    }
}
class D extends C{
    D(int a){
        super(20);
    }
}
public class JavaPractice2{
    public static void main(String[] args) {
        new D(70);
    }
}
//hybrid inheritance ::parameterised constructor
//Error-->
