abstract class A{
    abstract void show();
    abstract void disp(int a);
    abstract int disp1();
    abstract int disp2(int b);
    abstract A show1();
}
class B extends A{
    void show(){
        System.out.println("Show Method");
    }
    void disp(int a){
        System.out.println("a: "+a);
    }
    int disp1(){
        int a = 30;
        return a;
    } 
    int disp2(int b){
        return b;
    }
    A show1(){
        System.out.println("Covariant return type");
        return this;
    }
}
public class Main{
    public static void main(String[] args){
        B obj = new B();
        obj.show();
        obj.disp(70);
        System.out.println(obj.disp1());
        System.out.println(obj.disp2(20));
        obj.show1();
    } 
}
/*abstract class 
	no return and no argument :abstract 
	no return and  argument :abstract 
	 return and no argument :abstract 
	 return and  argument :abstract 
	 covariant return type :abstract 

class extends abstract class 

Main classs 
access*/
