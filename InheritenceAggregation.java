public class InheritenceAggregation {
    public static void main(String[] args) {
        Amazon3 a3 = new Amazon3();
        a3.accessories();
        a3.grocery();
        Myntra3 m3 = new Myntra3();
        m3.brand();
        m3.accessories();
    }
}
/*single level inheritance 

file Flipcart 
->accessories() :covariant return type 

file Amazon
->grocery():covariant return type 

file Myntra
->brand() :covariant return type 


file Main*/