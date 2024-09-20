abstract class Abstraction3{
    Abstraction3(){
        System.out.println("abstrcat class default constructor");
    }
    Abstraction3(int a){
        System.out.println("abstrcat class parameterized constructor "+a);
    }
    abstract String show();
    abstract int show1(int a);
}
public class B3 extends Abstraction3{
    B3(){
        super();
    }
    B3(int a){
        super(90);
    }
    public String show(){
        return "Java Programming";
    }
    public int show1(int a){
        return a;
    }
}
// abstract class :
// 	constructor :constructor overloading  
// 	 return and no argument : abstract method
// 	 return and  argument : abstract method

// class B extends abstract class 


// class Main 