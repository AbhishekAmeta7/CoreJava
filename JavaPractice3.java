class A{
    int show(int a){
        return a;
    }
    float show(float a){
        return a;
    } 
}
class B extends A{
    void display(int a,int b){
        System.out.println(a+" "+b);
    }
    void display(float a,float b){
        System.out.println(a+" "+b);
    } 
}
public class JavaPractice3{
    public static void main(String[] args) {
        B ob = new B();
        System.out.println(ob.show(20));
        System.out.println(ob.show(35.6f));
        ob.display(2, 5);
        ob.display(3.4f, 7.5f);
    }
}
/*single level inheritance : method overloading*/