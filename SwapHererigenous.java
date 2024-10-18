public class SwapHererigenous {
    public static void printArray(Object[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void swap(Object[] a,int i,int j) {
        printArray(a);
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        printArray(a);
    }
    public static void main(String[] args) {
        Object a[] = {'A',"Abhishek",7,true,77.2f};
        int i = 0,j = a.length-1;
        swap(a, i, j);
    }
}