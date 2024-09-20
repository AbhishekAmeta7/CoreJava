interface A{
    int show1(int a);
    interface B{
        int show2();
        interface C{
            void show3(String s);
        }
    }
}
public class NestedInterfaceAccess1 implements A.B.C{
    public int show1(int a){
        return a;
    }
    public int show2(){
        System.out.println("show2 inside Nested Interface B");
        return 0;
    }
    public void show3(String s){
        System.out.println(s);
    }
}