public class TestProduct {
    public static void main(String [] args){
        Product p1 = new Product();
        Product p2 = new Product("Phone", 95,40.000);

        System.out.println(p1);
        System.out.println(" Name " + p2.getName() + " Quality " + p2.getQuality() + " Price " + p2.getPrice());




    }
}
