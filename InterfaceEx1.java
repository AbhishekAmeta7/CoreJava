interface A{
    void display1();
}
interface B{
    int display2();
}
interface C{
    int display3(int a);
}
interface D{
    void display4(int a);
}
public class InterfaceEx1 implements A,B,C,D {
    public void display1(){
        System.out.println("display1 method inside interface A");
    }
    public int display2(){
        System.out.println("dispaly2 method indide interface B");
        return 0;
    }
    public int display3(int a){
        return a;
    }
    public void display4(int a){
        System.out.println("display4 method inside interface D "+a);
    }
}