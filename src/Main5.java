public class Main5 {
    public static void main(String[] args){
        Flower rose = new Flower("Pink", "Rose",1.5 );

        Bouquet romanticBuket = new Bouquet("Romantic " , rose  , 12);

        System.out.println("Bouquet Theme: " + romanticBuket.getTheme());
        System.out.println("Flower Type : " + romanticBuket.getFlower().getName());
        System.out.println("Flower Color: " + romanticBuket.getFlower().getColor());
        System.out.println("Unit Price  : " + romanticBuket.getFlower().getUnitPrice());
        System.out.println("Amount      : " + romanticBuket.getNumOfFlowers());

        System.out.println("Total Cost  : " + romanticBuket.getCost());



    }
}
