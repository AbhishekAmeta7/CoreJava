class A{
    class B{
        public void disp1(){
            System.out.println("Non-static method inside nonstatic class B");
        }
    }
    class C{
        public static void disp2(){
            System.out.println("static method inside nonstatic class C");
        }
    }
}
public class NonStaticClassStaticMethod {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        b.disp1();
        A.C.disp2();
    }
}
/*9)class A 
	non static class B non static method 
	non static class C static method */