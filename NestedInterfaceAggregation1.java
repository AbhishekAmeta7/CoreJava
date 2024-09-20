public class NestedInterfaceAggregation1 {
    public static void main(String[] args) {
        NestedInterfaceAccess1 ni = new NestedInterfaceAccess1();
        System.out.println("show1 inside interface A"+ni.show1(6));
        ni.show2();
        ni.show3("Nested Interface Aggregation");
    }
}