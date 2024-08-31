abstract class A{
    A(){
        System.out.println("abstract class Default Constructor");
    }
    A(int a){
        System.out.println("abstract class Parameterized Constructor "+a);
    }
    abstract int show();
    abstract int display(int a);
}
class B extends A{
    B(){
        super();
    }
    B(int a){
        super(4);
    }
    int show(){
        System.out.println("abstract method with return & no argument");
        return 0;
    }
    int display(int a){
        return a;
    }
}
public class AbstractionEx3{
    public static void main(String[] args) {
        B b = new B();
        new B(8);
        b.show();
        System.out.println("abstract method with return & with argument");
        
    }
}
/*abstract class :
	constructor :constructor overloading  
	 return and no argument : abstract method
	 return and  argument : abstract method

class B extends abstract class 

class Main*/