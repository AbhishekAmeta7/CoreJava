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
class C extends B{
    C(){
        super(540);
        System.out.println("Hello!...");
    }
    C(int roll){
        super("BCA 3rd year");
        System.out.println("Roll No.: "+roll);
    }
}
public class MultiLevel{
    public static void main(String[] args) {
       new C();
       new C(107);
    }
}
/*multilevel inheritance:constructor overlaoding*/
