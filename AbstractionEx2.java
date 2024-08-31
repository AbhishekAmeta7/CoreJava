abstract class A{
 A(){
    System.out.println("Abstract Class Default Constructor");
 }   
 abstract int show();
 abstract int display(int a);
}
class B extends A{
    int show(){
        System.out.println("abstract method with return & No Argument");
        return 0;
    }
    int display(int a){
        return a;
    }
}
public class AbstractionEx2{
    public static void main(String[] args) {
        B b = new B();
        b.show();
        System.out.println("abstract method with Return & With Argument "+b.display(7));
    }
}
/*abstract class :
	constructor :default 
	 return and no argument : abstract method
	 return and  argument : abstract method

class B extends abstract class 


class Main*/