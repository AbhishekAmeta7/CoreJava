abstract class A {
    abstract void show();
}
abstract class B extends A{
    abstract void show(int a);
}
abstract class C extends B{
    abstract int display();
}
abstract class D extends C{
    abstract int display(int a);
}
abstract class E extends D{
    abstract E disp();
}
class Test extends E{
    void show(){
        System.out.println("Abstract class A method");
    }
    void show(int a){
        System.out.println("Abstract class B method"+a);
    }
    int display(){
       System.out.println("Abstract class C method");
       return 0;
    }
    int display(int a){
        return a;
    }
    E disp(){
        System.out.println("Covariant return type");
        return this;
    }
}
public class Main1{
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.show(2);
        t.display();
        System.out.println("Abstract class D method"+t.display(7));
        t.disp();
    }
}
/*abstract class 
	no return and no argument :abstract 

abstract class 
	no return and  argument :abstract 

abstract class 
	 return and no argument :abstract 

abstract class 
	 return and  argument :abstract 

abstract class 
	 covariant return type :abstract 

class extends abstract class 

Main classs 
access
multi level inheritance*/