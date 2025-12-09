public class TestProduct {
    public static void main(String [] args){
        Product p1 = new Product();
        Product p2 = new Product("Phone", 95, 40.00);

        System.out.println(p1);
        System.out.println(" Name " + p2.getName() + " Quantity " + p2.getQuantity() + " Price " + p2.getPrice());
        System.out.println(" Value " + p2.getItemValue());
        System.out.println(p2);




    }
}
