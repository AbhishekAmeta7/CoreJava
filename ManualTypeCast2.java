public class ManualTypeCast2 {
    public static void main(String[] args) {
        long a = 123;
        char b = (char)a;
        short c = (short)a;
        byte d = (byte)a;
        System.out.println("long: "+a);
        System.out.println("char: "+b);
        System.out.println("short: "+c);
        System.out.println("byte: "+d);
    }
}
// long -> int
// long -> char
// long -> short
// long -> byte 