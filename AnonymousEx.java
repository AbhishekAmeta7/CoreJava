abstract class AnonymousEx {
    abstract void disp(int a);
     void disp1(int a){
        System.out.println("non-abstract method inside abstract class "+a);
     }
    abstract void disp2(int a);
    void disp3(int a){
        System.out.println("non-abstract method disp3 inside abstract class "+a);
    }
}