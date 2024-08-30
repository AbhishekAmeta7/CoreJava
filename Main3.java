abstract class A{
	abstract void a();
}
class A1 extends A{
	void a(){
		System.out.println("a method class A1");
	}
}
class A2 extends A{
	void b(){
		System.out.println("b method");
	}
	void a(){
		System.out.println("a method class A2");
	}
}
abstract class B{
	abstract void a(int a);
}
class B1 extends B{
	void a(int a){
		System.out.println(a);
	}
}
class B2 extends B{
	void a(int a){
		System.out.println("abstract method a with argument");
	}
}
abstract class C{
	abstract int show();
} 
class C1 extends C{
	int show(){
		System.out.println("abstract method show C1 class"); 
		return 0;
	}
}
class C2 extends C{
	int show(){
		int a = 90;
		return a;
	}
}
abstract class D{
	abstract int display(int x);
}
class D1 extends D{
	int display(int x){
		return x;
	}
}
class D2 extends D{
	int display(int x){
		System.out.println("Abstract method return and argument");
		return 0;
	}
}
abstract class E{
	abstract E disp();
}
class E1 extends E{
	E disp(){
		System.out.println("Covarient return type1");
		return this;
	}
}
class E2 extends E{
	E disp(){
		System.out.println("Covarient return type2");
		return this;
	}
}
public class Main3{
    public static void main(String[] args) {
        A1 a1 = new A1();
		a1.a();
		A2 a2 = new A2();
		a2.b();
		a2.a();
		B1 b1 = new B1();
		b1.a(9);
        B2 b2 = new B2();
		b2.a(8);
		C1 c1 = new C1();
		c1.show();
		C2 c2 = new C2();
		System.out.println(c2.show());
		D1 d1 = new D1();
		System.out.println(d1.display(45));
		D2 d2 = new D2();
		d2.display(45); 
		E1 e1 = new E1();
		e1.disp();
		E2 e2 = new E2();
		e2.disp();

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
heirarichal level inheritance*/