abstract class Abstrcation2{
    Abstrcation2(int n){
        System.out.println("abstract class parameterized constructor "+n);
    }
    abstract int show();
    abstract int sho1(int a);
}
public class B2 extends Abstrcation2{
    B2(int n){
        super(89);
    }
    public int show(){
        return 10;
    }
    public int sho1(int a){
        System.out.println("Hello");
        return a;
    } 
}
// abstract class :
// 	constructor :default 
// 	 return and no argument : abstract method
// 	 return and  argument : abstract method
// class B extends abstract class 