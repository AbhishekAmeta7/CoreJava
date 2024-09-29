import java.util.*;
public class DynamicArrayEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of int Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n;i++){
            System.out.print("Enter Element: ");
            a[i] = sc.nextInt();
        }
        System.out.println("------------x------------");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last int Element: "+a[a.length-1]);
        if(n%2==0){
            System.out.println("Middle int Element: "+a[(a.length)/2-1]);
            System.out.println(a[a.length/2]);
        }
        else{
            System.out.println("Middle int Element: "+a[a.length/2]);
        }

        System.out.print("Enter length of char Array: ");
        int n1 = sc.nextInt();
        char c[] = new char[n1];
        for(int i=0; i<n1; i++){
            System.out.print("Enter character Element: ");
            c[i] = sc.next().charAt(0);
        }
        System.out.println("------------x------------");
        System.out.println("First Element: "+c[0]);
        System.out.println("Last character Element: "+c[c.length-1]);
        if(n1%2==0){
            System.out.println("Middle character Element: "+c[(c.length)/2-1]);
            System.out.println(c[c.length/2]);
        }
        else{
            System.out.println("Middle character Element: "+c[c.length/2]);
        }

        System.out.print("Enter length of String Array: ");
        int n2 = sc.nextInt();
        String s[] = new String[n2];
        sc.nextLine();
        for(int i=0; i<n2; i++){
            System.out.print("Enter String Element: ");
            s[i] = sc.nextLine();
        }
        System.out.println("------------x------------");
        System.out.println("First Element: "+s[0]);
        System.out.println("Last String Element: "+s[s.length-1]);
        if(n2%2==0){
            System.out.println("Middle String Element: "+s[(s.length)/2-1]);
            System.out.println(s[s.length/2]);
        }
        else{
            System.out.println("Middle String Element: "+s[s.length/2]);
        }
 

        System.out.print("Enter length of float Array: ");
        int n3 = sc.nextInt();
        float f[] = new float[n3];
        for(int i=0; i<n3; i++){
            System.out.print("Enter float Element: ");
            f[i] = sc.nextFloat();
        }
        System.out.println("------------x------------");
        System.out.println("First Element: "+f[0]);
        System.out.println("Last float Element: "+f[f.length-1]);
        if(n3%2==0){
            System.out.println("Middle float Element: "+f[(f.length)/2-1]);
            System.out.println(f[f.length/2]);
        }
        else{
            System.out.println("Middle float Element: "+f[f.length/2]);
        }

        System.out.print("Enter length of boolean Array: ");
        int n4 = sc.nextInt();
        boolean b[] = new boolean[n4];
        for(int i=0; i<n4; i++){
            System.out.print("Enter boolean Element: ");
            b[i] = sc.nextBoolean();
        }
        System.out.println("------------x------------");
        System.out.println("First Element: "+b[0]);
        System.out.println("Last boolean Element: "+b[b.length-1]);
        if(n4%2==0){
            System.out.println("Middle boolean Element: "+b[(b.length)/2-1]);
            System.out.println(b[b.length/2]);
        }
        else{
            System.out.println("Middle boolean Element: "+b[b.length/2]);
        }

        System.out.print("Enter length of byte Array: ");
        int n5 = sc.nextInt();
        byte by[] = new byte[n5];
        for(int i=0; i<n5; i++){
            System.out.print("Enter byte Element: ");
            by[i] = sc.nextByte();
        }
        System.out.println("------------x------------");
        System.out.println("First Element: "+by[0]);
        System.out.println("Last byte Element: "+by[by.length-1]);
        if(n5%2==0){
            System.out.println("Middle byte Element: "+by[(by.length)/2-1]);
            System.out.println(by[by.length/2]);
        }
        else{
            System.out.println("Middle byte Element: "+by[by.length/2]);
        }

        System.out.print("Enter length of long Array: ");
        int n6 = sc.nextInt();
        long l[] = new long[n6];
        for(int i=0; i<n6; i++){
            System.out.print("Enter long Element: ");
            l[i] = sc.nextLong();
        }
        System.out.println("------------x------------");
        System.out.println("First Element: "+l[0]);
        System.out.println("Last long Element: "+l[l.length-1]);
        if(n6%2==0){
            System.out.println("Middle long Element: "+l[(l.length)/2-1]);
            System.out.println(l[l.length/2]);
        }
        else{
            System.out.println("Middle long Element: "+l[l.length/2]);
        }

        System.out.print("Enter length of double Array: ");
        int n7 = sc.nextInt();
        double d[] = new double[n7];
        for(int i=0; i<n7; i++){
            System.out.print("Enter doubleElement: ");
            d[i] = sc.nextDouble();
        }
        System.out.println("------------x------------");
        System.out.println("First Element: "+d[0]);
        System.out.println("Last long Element: "+d[d.length-1]);
        if(n7%2==0){
            System.out.println("Middle double Element: "+d[(d.length)/2-1]);
            System.out.println(d[d.length/2]);
        }
        else{
            System.out.println("Middle double Element: "+d[d.length/2]);
        }

        System.out.print("Enter length of short Array: ");
        int n8 = sc.nextInt();
        short sh[] = new short[n8];
        for(int i=0; i<n8; i++){
            System.out.print("Enter short Element: ");
            sh[i] = sc.nextShort();
        }
        System.out.println("------------x------------");
        System.out.println("First Element: "+sh[0]);
        System.out.println("Last short Element: "+sh[sh.length-1]);
        if(n8%2==0){
            System.out.println("Middle short Element: "+sh[(sh.length)/2-1]);
            System.out.println(sh[sh.length/2]);
        }
        else{
            System.out.println("Middle short Element: "+sh[sh.length/2]);
        }
    }
}