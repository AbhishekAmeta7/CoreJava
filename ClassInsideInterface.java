interface A1{
    class A{
        void show(){
            System.out.println("show in A Class & A in A1 interface");
        }
    }
    class B{
        void show(int a){
            System.out.println("show in B Class & A in A1 interface "+a);
        }
    }
    class C{
        int show(){
            System.out.println("show in C Class & A in A1 interface ");
            return 0;
        }
    }
    class D{
        int show(int a){
            return a;
        }
    }
    class E{
        E show(){
            System.out.println("covarient return show in E class & E in A1 interface");
            return this;
        }
    }
}
public class ClassInsideInterface extends A1.A{}
class B1 extends A1.B{}
class C1 extends A1.C{}
class D1 extends A1.D{}
class E1 extends A1.E{}
