public class InterfaceWithAggregation {
    public static void main(String[] args) {
        ClassInsideInterface ci = new ClassInsideInterface();
        ci.show();
        B1 b = new B1();
        b.show(20);
        C1 c = new C1();
        c.show();
        D1 d = new D1();
        System.out.println("show in class D & D in interface A1 "+d.show(30));
        E1 e = new E1();
        e.show();
    }
}
