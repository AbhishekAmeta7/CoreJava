public class ManualTypeCast4 {
    public static void main(String[] args) {
        double a = 12300.5;
        long b = (long)a;
        float c = (float)b;
        System.out.println("double---->long --->float: "+c);
        double a1 = 20000.5;
        int a2 = (int)a1;
        float a3 = a2;
        System.out.println("double-->int--->float: "+a3);
        double b1 = 100.8;
        char b2 = (char)b1;
        float b3 = b2;
        System.out.println("double--->char--->float: "+b3);
        double c1 = 230.7;
        short c2=(short)c1;
        float c3 = (float)c2;
        System.out.println("double--short--->float: "+c3);
        long p = 12345678;
        short q = (short)p;
        int r = q;
        System.out.println("long --->short--->int: "+r);
    }
}
// double -> float -> long -> int -> char -> short -> byte  

// double---->long --->float 
// double-->int--->float 
// double--->char--->float 
// double--short--->float 

// long --->short--->int 

// solution code error 