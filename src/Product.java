public class Product {

    private String name;
    private int quality;
    private double price;
    private int productId;
    private static int idCounter;

    public Product(){
        this.name = " ";
        this.quality = 0;
        this.price = 0.0;
        this.productId = 0;
        idCounter++;

    }
    public Product(String name , int quality , double price){
        this.name = name;
        this.quality = quality;
        this.price = price;
        this.productId = productId;
        idCounter++;

    }
    public String getName() {

        return name;
    }
    public int getQuality() {

        return quality;
    }
    public double getPrice() {

        return price;
    }
    public int getProductId() {

        return productId;
    }
    public static int getCounterId(){
        return idCounter;

    }
    public double getItemValue() {

        return productId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setQuality(int quality){
        if (quality < 0){
            this.quality = 0;
        }else{
            this.quality = quality;

        }


    }
    public void setPrice(double price){
        if (price < 0){
            this.price = 0.0;
        }else{
            this.price = price;

        }

    }
    public String toString() {
        return "Product [ ID : " + productId + ", Name: " + name + "Quality : " + quality + "Price : " + price ;
    }





}
