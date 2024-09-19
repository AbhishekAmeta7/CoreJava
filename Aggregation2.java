public class Aggregation2 {
    public static void main(String[] args) {
        A1 a = new A1();
        a.show();
        a.show1(7);
        B1 b = new B1();
        b.show();
        System.out.println("return & argument in Class B1: "+b.show1(40));
    }
}
/*
 file A
no return and no argument 
no return and argument 

file B
return and no argument 
return and argument 

file Main 

aggregation
*/