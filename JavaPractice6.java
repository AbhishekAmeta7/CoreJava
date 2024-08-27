class A{
    int add(int x,int y){
        return x+y;
    }
    float add(float x,float y){
        return x+y;
    }
}
public class JavaPractice6{
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.add(20, 4));
        System.out.println(a.add(9.5f, 20.3f));
    }
}
//->in a class method name same but number of parameter also same but return type of method will be change