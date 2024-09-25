public class ManualTypeCast {
    public static void main(String[] args) {
        double a = 50.50;
        float b = (float)a;
        long c = (long)a;
        int d = (int)a;
        char e = (char)a;
        short f = (short)a;
        byte g = (byte)a;
        System.out.println("double: "+a);
        System.out.println("float: "+b);
        System.out.println("long: "+c);
        System.out.println("int: "+d);
        System.out.println("char: "+e);
        System.out.println("short: "+f);
        System.out.println("byte: "+g);
    }
}
// double -> float -> long -> int -> char -> short -> byte  

// double -> float 
// double -> long  
// double -> int  
// double -> char 
// double -> short 
// double ->  byte  