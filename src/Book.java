public class Book {
    String title; //başlığını alacağız
    String author; // yazarını alacağız
    double price; // fiyatını alacağız

    public Book() { // book constructor yaratıyoruz ve içine başta tanuımladığımız parametreleri belirliyoruz.

        title = "--";
        author = "--";
        price = 0;
    }

    public Book(String title, String author, double price) { // method parametreleri kendisine eşitliyoruz this.something = something mesela.
        this.title = title;
        this.author = author;
        this.price = price;


    }

    public void showDetails() { //burda da method yapıyoruz bize göstermesi için

        System.out.println(title + " // " + author + " // " + price);

    }

    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book("Java 101", "James Gosling", 150.0);
        book1.showDetails();
        book2.showDetails();
    }
}

