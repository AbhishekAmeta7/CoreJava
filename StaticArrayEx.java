public class StaticArrayEx{
    public static void main(String[] args) {
        int a[] = {11,22,33,44,55,66,77};
        System.out.println("Random int Data: "+a[2]);
        System.out.println("integer First Element: "+a[0]);
        System.out.println("integer Last Element: "+a[a.length-1]);
        System.out.println("integer mid Element: "+a[(a.length)/2]);
        float f[] = {5.3f,6.4f,8.3f,9.8f,2.4f};
        System.out.println("--------------X--------------");
        System.out.println("Random float Data: "+f[3]);
        System.out.println("float First Element: "+f[0]);
        System.out.println("float Last Element: "+f[f.length-1]);
        System.out.println("float mid Element: "+f[(f.length)/2]);
        char c[] = {'A','B','C','D','E','F','G'};
        System.out.println("--------------X--------------");
        System.out.println("Random char Data: "+c[1]);
        System.out.println("char First Element: "+c[0]);
        System.out.println("char Last Element: "+c[c.length-1]);
        System.out.println("char mid Element: "+c[(c.length)/2]);
        String s[] = {"Jay","Abhi","Ram","Rahul","Krishna","Aakash"};
        System.out.println("--------------X--------------");
        System.out.println("Random String Data: "+s[1]);
        System.out.println("String First Element: "+s[0]);
        System.out.println("String Last Element: "+s[s.length-1]);
        System.out.println("String mid Element: "+s[(s.length)/2-1]);
        System.out.println(s[(s.length)/2]);
        long l[] = {1111,1234,323433,654323,69586958,8473843};
        System.out.println("--------------X--------------");
        System.out.println("Random long Data: "+l[4]);
        System.out.println("long First Element: "+l[0]);
        System.out.println("long Last Element: "+l[l.length-1]);
        System.out.println("long mid Element: "+l[(l.length)/2-1]);
        System.out.println(l[(l.length)/2]);
        double d[] = {463.2,384.5,633.8,623.9,2523.9};
        System.out.println("--------------X--------------");
        System.out.println("Random double Data: "+d[3]);
        System.out.println("double First Element: "+d[0]);
        System.out.println("double Last Element: "+d[d.length-1]);
        System.out.println("double mid Element: "+d[(d.length)/2]);
        short sh[] = {1,2,34,65,77};
        System.out.println("--------------X--------------");
        System.out.println("Random short Data: "+sh[2]);
        System.out.println("short First Element: "+sh[0]);
        System.out.println("short Last Element: "+sh[sh.length-1]);
        System.out.println("short mid Element: "+sh[(sh.length)/2]);
        byte b[] = {1,2,3,4,5,6};
        System.out.println("--------------X--------------");
        System.out.println("Random byte Data: "+b[2]);
        System.out.println("byte First Element: "+b[0]);
        System.out.println("byte Last Element: "+b[b.length-1]);
        System.out.println("byte mid Element: "+b[(b.length)/2-1]);
        System.out.println(b[(b.length)/2]);
        boolean bool[] = {true,true,false,true,true};
        System.out.println("--------------X--------------");
        System.out.println("Random boolean Data: "+bool[2]);
        System.out.println("boolean First Element: "+bool[0]);
        System.out.println("boolean Last Element: "+bool[bool.length-1]);
        System.out.println("boolean mid Element: "+bool[(bool.length)/2]);
    }
}
// array create :
// static and dynamic both
// int random data first element and last element mid element
// float random data second element and last second element mid element
// char random data  first element and last element mid element 
// String random data second element and last second element mid element 
// long random data  first element and last element mid element 
// double random data second element and last second element mid element 
// short random data  first element and last element mid element 
// byte random data second element and last second element mid element 
// Boolean random data  first element and last element mid element