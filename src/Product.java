public class Product {

    private static int idCounter = 1000;

    private final int productId;
    private String name;
    private int quantity;
    private double price;

    public Product() {
        this("Unnamed", 0, 0.0);
    }

    public Product(String name, int quantity, double price) {
        this.productId = ++idCounter;
        setName(name);
        setQuantity(quantity);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    // Kept for backward compatibility with existing code
    public int getQuality() {
        return getQuantity();
    }

    public double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    public static int getCounterId() {
        return idCounter;
    }

    public double getItemValue() {
        return price * quantity;
    }

    public void setName(String name) {
        this.name = (name == null || name.isBlank()) ? "Unnamed" : name.trim();
    }

    public void setQuantity(int quantity) {
        this.quantity = Math.max(quantity, 0);
    }

    public void setQuality(int quality) {
        setQuantity(quality);
    }

    public void setPrice(double price) {
        this.price = Math.max(price, 0.0);
    }

    @Override
    public String toString() {
        return "Product{id=" + productId +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", value=" + String.format("%.2f", getItemValue()) +
                '}';
    }
}
