class A{
    void disp(int a){
        System.out.println("int: "+a);
    }
    void disp(byte a){
        System.out.println("byte: "+a);
    }
}
public class JavaPractice7{
    public static void main(String[] args) {
        A obj = new A();
        obj.disp(7);
        obj.disp(3);
    }
}
//in a class method name same but parameter also same but first in int and second method in byte then what happend ?