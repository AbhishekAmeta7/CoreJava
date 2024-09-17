class A{
    static class B{
        void show(){
            System.out.println("non-static method inside static inner class");
        }
    }
}
public class NonStaticMethodinStaticInner {
    public static void main(String[] args) {
        A.B a = new A.B();
        a.show();
    }
}
//3)outer class  non static and inner class static and method  non static : 