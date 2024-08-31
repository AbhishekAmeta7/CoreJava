abstract class A{
    abstract void add();
    abstract void sub(int a,int b);
    abstract int multi();
    abstract int divide(int a,int b);
}
class B extends A{
    void add(){
        int a = 90,b=20;
        System.out.println("Addition: "+(a+b));
    }
    void sub(int a,int b){
        System.out.println("Subtraction: "+(a-b));
    }
    int multi(){
        int a=5,b=6;
        return a*b;
    }
    int divide(int a,int b){
        return a/b;
    }
}
public class AbstractionEx1{
    public static void main(String[] args) {
        B obj = new B();
        obj.add();
        obj.sub(60,40);
        System.out.println("Multiply: "+obj.multi());
        System.out.println("Division: "+obj.divide(40, 5));
    }
}
/*abstract class :
	no return and no argument : abstract method 
	no return and  argument : abstract method
	 return and no argument : abstract method
	 return and  argument : abstract method

class B extends abstract class 
class Main 
access all the methods through refrence variable*/