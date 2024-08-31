abstract class A{
    A(int a){
        System.out.println("Parameterized Constructor in abstract class");
    }
    abstract int show();
    abstract int display(int a);
}
class B extends A{
    B(){
        super(0);
    }
    int show(){
        System.out.println("abstract method with return & no argument");
        return 0;
    }
    int display(int a){
        return a;
    }
}
public class AbstractionEx4{
    public static void main(String[] args) {
        B b = new B();
        b.show();
        System.out.println("abstract method with return & with argument");
    }
}
/*abstract class :
	constructor :parameterised  
	 return and no argument : abstract method
	 return and  argument : abstract method

class B extends abstract class 
class Main*/