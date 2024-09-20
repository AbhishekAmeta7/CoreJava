abstract class Abs1 {
    abstract void show();
}
abstract class Abs2 extends Abs1{
    abstract void show1(int a);
}
abstract class Abs3 extends Abs1{
    abstract int show2();
}
abstract class Abs4 extends Abs1{
    abstract int show3(int a);
}
abstract class Abs5 extends Abs1{
    abstract Abs5 show4();
}
public class AbstractAccess extends Abs1{
    public void show(){
        System.out.println("abtract method show inside abstract class Abs1");
    }
}
