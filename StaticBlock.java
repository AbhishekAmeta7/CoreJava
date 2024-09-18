class A{
    private static String name;
    static{
        name="Abhishek Vyas";
        System.out.println("Static block in non-static class");
        System.out.println(name);
    }
    {
        System.out.println("Anonymous block in non-static class");
    }
}
public class StaticBlock {
    public static void main(String[] args){
        new A();
    }
}
