class A{
    static class B{
        static void show1(){
            System.out.println("static method inside static inner class B");
        }
    }
    static class C{
        static void show2(){
            System.out.println("static method inside static inner class C");
        }
    }
}
public class StaticInnerClasses {
    public static void main(String[] args) {
        A.B.show1();
        A.C.show2();
    }
}
/*5)
class A 
	static class B static method 
	static class C static method */