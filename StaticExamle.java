class A{
    static int a;
    A(){
        a++;
        System.out.println(a);
    }
}
public class StaticExamle{
    public static void main(String[] args) {
        new A();
        new A();
        new A();
        new A();
        new A();
    }
}
/*static instance variable 
	5 constructor call*/