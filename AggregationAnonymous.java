public class AggregationAnonymous {
    public static void main(String[] args) {
        AnonymousEx an = new AnonymousEx(){
            public void disp(int a){
                System.out.println("abstract method disp inside abstract class "+a);
            }
            public void disp2(int a){
                System.out.println("non-abstract method disp2 inside abstract class "+a);
            }
        };
        an.disp(90);
        an.disp1(9);
        an.disp2(7);
        an.disp3(8);
    }
}