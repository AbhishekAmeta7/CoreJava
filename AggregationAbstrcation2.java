public class AggregationAbstrcation2 {
    public static void main(String[] args) {
        AbstractAccess ac = new AbstractAccess();
        ac.show();
        ac.show1(89);
        ac.show2();
        System.out.println(ac.show3(90));
        ac.show4();
    }
}