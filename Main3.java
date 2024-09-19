public class Main3 {
    public static void main(String[] args) {
        Flipkart2 f2 = new Flipkart2();
        f2.setAccessories("Electronic Items-->T.V,Mobiles,Laptop");
        System.out.println(f2.getAccessories());
        Amazon2 a2 = new Amazon2();
        a2.setsPrice(150);
        System.out.println("Starting Price Of Grocery Items: "+a2.getPrice());
        Myntra2 m2 = new Myntra2();
        m2.setFashion("Clothes,Shoes,Jackets,Watches");
        System.out.println("Fashion Item: "+m2.getFashion());
    }
}
/*getter setter :

file Flipcart 


file Amazon


file Myntra


file Main*/