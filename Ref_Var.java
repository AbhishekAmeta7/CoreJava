class A{
    int a = 20;
}
class B extends A{
    int a = 30;
}
public class Ref_Var {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.a);
    }
}
/*want to print instance variable value through refrence variable */