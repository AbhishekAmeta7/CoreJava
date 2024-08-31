abstract class A{
    A(String name){
        System.out.println("Name: "+name);  
    }
    abstract int add();
    abstract int sub(int a,int b);
}
class B extends A{
    B(){
        super("Abhi");
    }
    int add(){
        int a = 10,b=50;
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }
}
public class AbstractionEx{
    public static void main(String[] args){
        B obj= new B();
        System.out.println("Add: "+obj.add());
        System.out.println("Sub: "+obj.sub(60, 40));

    }
}
/*abstract class :
	constructor :parameterised  
	 return and no argument : abstract method
	 return and  argument : abstract method

class B extends abstract class 


class Main*/