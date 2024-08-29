class A{
    A(int a,int b){
        System.out.println(a+" "+b);
    }
    A(int a,int b,int c){
        System.out.println(a+" "+b+" "+c);
    }
}
public class Constructor_OverLoading{
    public static void main(String[] args) {
        new A(20, 3);
        new A(10,30,40);
    }
}
/*constructor overloading 
	parameter same and return type of parameter change 
	parameter number change*/