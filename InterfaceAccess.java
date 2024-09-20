interface InterfaceEx{
    void show1();
    int show2();
    int show3(int a);
    void show4(int a);
}
public class InterfaceAccess implements InterfaceEx{
    public void show1(){
        System.out.println("Show1 method in interface");
    }  
    public int show2(){
        System.out.println("Show1 method in interface");
        return 0;
    }  
    public int show3(int a){
        return a;
    }
    public void show4(int a){
        System.out.println("Show1 method in interface "+a);
    }
}
// interface 
// 	method1 :no return and no argument 
// 	method2 : return and no argument 
// 	method3: return and  argument 
// 	method4 :no return and  argument
// class B imple 
// Main class access