public class Reference {
    A p;
    int a;
    Reference(A p,int a){
       this.p = p;
       this.a = a; 
    }
    void show(){
        System.out.println("Name: "+p.name+"\nNumber: "+p.num);
        System.out.println(a);
    }
    public static void main(String[] args){
        A k = new A("Abhishek",20);
        Reference r = new Reference(k,50);
        r.show();
    }
}
