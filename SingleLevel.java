class A{
    A(int id){
        System.out.println("ID: "+id);
    }
    A(String name,long contact){
        System.out.println("Name: "+name);
        System.out.println("Contact: "+contact);
    }
}
class B extends A{
    B(int marks){
        super(34);
        System.out.println("Marks: "+marks);
    }
    B(String c){
        super("Abhishek Vyas",123456789);
        System.out.println("Class: "+c);
    }
}
public class SingleLevel{
    public static void main(String[] args) {
        new B(540);
        new B("BCA 3rd year");
    }
}
/*single level :constructor overlaoding*/