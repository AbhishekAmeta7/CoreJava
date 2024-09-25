public class TypeCasting2 {
    public static void main(String[] args) {
        short a = 97;
        char ch = (char)a;
        int c = a;
        long d = a;
        float e = a;
        double f = a;
        System.out.println("Short: "+a);
        System.out.println("Char: "+ch);
        System.out.println("int: "+c);
        System.out.println("long: "+d);
        System.out.println("float: "+e);
        System.out.println("double: "+f);
    }
}
// short -> char
// short -> int 
// short -> long
// short -> float
// short -> double 