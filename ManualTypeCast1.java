public class ManualTypeCast1{
    public static void main(String[] args) {
        float a = 100.7f;
        int b = (int)a;
        char c = (char)a;
        short d = (short)a;
        byte e = (byte)a;
        System.out.println("float: "+a);
        System.out.println("int: "+b);
        System.out.println("char: "+c);
        System.out.println("short : "+d);
        System.out.println("byte: "+e);        
    }
}
// float -> long
// float -> int 
// float ->  char
// float -> short
// float -> byte 