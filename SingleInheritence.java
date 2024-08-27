class A{
    A(int a,int b){
        System.out.println("Add: "+(a+b));
    }
}
class B extends A{
    B(int a,int b){
        super(20, 30);
        System.out.println("Sub: "+(a-b));
    }
}
class C extends B{
    C(int a,int b){
        super(20,5);
        System.out.println("Multiply: "+(a*b));
    }
}
class D extends C{
    D(int a,int b){
        super(12,5);
        System.out.println("Divide: "+(a/b));
    }
}
public class SingleInheritence {
    public static void main(String[] args) {
         new D(100, 25);
         
    }
}
/*multilevel inheritance :parameterised constructor*/