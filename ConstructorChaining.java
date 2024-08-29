class A{
    A(){//1
        this(7);//2
        System.out.println("Default Constructor");
    }
    A(int a){//2
        this('H');//4
        System.out.println("Constructor2: "+a);
    }
    A(float a){//3
        this();//1
        System.out.println(a);
    }
    A(char a){//4
        this(60.7);//6
        System.out.println(a);
    }
    A(String a){//5
        this(2,3,4);//10
        System.out.println(a);
    }
    A(double a){//6
        System.out.println(a);
    }
    A(int a,int b){//7
        this("Hello","World!");//9
        System.out.println(a+b);
    }
    A(float a,float b){//8
        this(7.9f);//3
        System.out.println(a+" "+b);
    }
    A(String a,String b){//9
        this(8.5f,7.5f);//8
        System.out.println(a+" "+b);
    }
    A(int a,int b,int c){//10
        this(50,55);//7
        System.out.println(a+" "+b+" "+c);
    }
}
public class ConstructorChaining{
    public static void main(String[] args) {
        new A("Java");
        
        
    }
}
/*constructor chaining :
A() :1--->2-- 
A() :2---->4--
A() :3-->1--
A() :4---->6--
A() :5---->10
A() :6--
A() :7----->9--
A() :8---->3--
A() :9--->8--
A() :10---->7--*/