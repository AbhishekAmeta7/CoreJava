abstract class A{
    abstract void show();
}
class A1 extends A{
    void show(){
        System.out.println("Abstract Method show class A");
    }
}
abstract class B{
    abstract void show(int a);
}
class B1 extends B{
    void show(int a){
        System.out.println("Abstract Method show class B "+a);
    }
}
abstract class C{
    abstract int display();
}
class C1 extends C{
    int display(){
        int a = 10;
        return a;
    }
}
abstract class D{
    abstract int display(int a);
}
class D1 extends D{
    int display(int a){
        return a;
    }
}
abstract class E{
    abstract E disp();
}
class E1 extends E{
    E disp(){
        System.out.println("Covariant return type");
        return this;
    }
}
public class Main2{
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.show();
        B1 b1= new B1();
        b1.show(40);
        C1 c1 = new C1();
        System.out.println(c1.display());
        D1 d1 = new D1();
        System.out.println(d1.display(89));
        E1 e1 = new E1();
        e1.disp();
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
single level inheritance*/