public class StaticEx2 {
    static int a = 50;
    static void show(){
        a = 700;
        System.out.println("static method no retutn & no argument "+a);
    }
    static void show1(int x){
        System.out.println("static method no return & argument "+x);
    }
    static int show2(){
        System.out.println("static method return & no argument");
        return 0;
    }
    static int show3(int x){
        return x;
    }
    static StaticEx2 show4(){
        System.out.println("static method with covariant return type");
        return new StaticEx2();
    }
    public static void main(String[] args) {
        show();
        show1(70);
        show2();
        System.out.println("static method return & argument "+show3(111));
        StaticEx2 e = new StaticEx2();
        StaticEx2.show4();
    }
}
/*main class 
class 
	method :no return and no argument :static 
	method :no return and  argument :static 	method : return and no argument :static 	method : return and  argument :static
	covariant return type 

access*/