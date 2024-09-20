interface A{
    default int methos1(int a){
        return a;
    }
    int method2();
    default void method3(int a){
        System.out.println("Default method3 in interface A "+a);
    } 
}
public class NestedInterfaceAccess2 implements A{
    NestedInterfaceAccess2 method4(){
        System.out.println("covariant return method4 inside class NestedInterfaceAccess2");
        return this;
    }
    public int method2(){
        System.out.println("Default method2 in interface A");
        return 0;
    }
}