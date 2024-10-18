public class HeterogenousArray {
    public static void printArray(Object[] a) {
        System.out.println("Print Using Method");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Object a[] = {'A',"Abhishek",7,true,77.2f};
        System.out.println("Print Using For Loop");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("\nPrint Using For Each Loop");
        for (Object object : a) {
            System.out.print(object+ " ");
        }
        System.out.println();
        printArray(a);
    }
}