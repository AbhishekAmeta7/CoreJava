class A{
    void method1(int a){
        System.out.println(a);
    }
    void method1(int a,int b){
        System.out.println(a+" "+b);
    }
}
class B{
    void show1(int a){
        System.out.println(a);
    }
    void show1(int a,int b){
        System.out.println(a+" "+b);
    }
}
class C extends A,B{
    void display(int a){
        System.out.println(a);
    }
    void display(int a,int b){
        System.out.println(a+" "+b);
    }
}
class D extends C{
    void disp(int a){
        System.out.println(a);
    }
    void disp(){
        System.out.println("Hello");
    }
}
public class JavaPractice5{
    public static void main(String[] args) {
       
    }
}
/*hybrid inheritance :method overloading*/
//Error-ambiguity error