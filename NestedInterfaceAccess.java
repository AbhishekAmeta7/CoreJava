interface A{
    interface B{
        void show();
    }
}
public class NestedInterfaceAccess implements A.B {
    public void show(){
        System.out.println("show method inside Inner Interface");
    }
}