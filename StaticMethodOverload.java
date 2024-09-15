class A{;
    static void show(String name){
        System.out.println("Hello "+name);
    }
    static int show(int age){
        return age;
    }
    static void show(String a,String b){
        System.out.println(a+" "+b);
    }
}
public class StaticMethodOverload {
    public static void main(String[] args) {
        A a = new A();
        A.show("Abhishek");
        System.out.println("Your Age is: "+A.show(21));
        A.show("Java", "Programming Language");
    }
}
//static method overload