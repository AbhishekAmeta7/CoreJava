public class InterfaceAggregation {
    public static void main(String[] args) {
        InterfaceAccess i = new InterfaceAccess();
        i.show1();
        i.show2();
        System.out.println(i.show3(67));
        i.show4(8);
    }
}
// interface 
// 	method1 :no return and no argument 
// 	method2 : return and no argument 
// 	method3: return and  argument 
// 	method4 :no return and  argument
// class B imple 
// Main class access