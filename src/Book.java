public class Book {
    String title; //başlığını alacağız
    String author; // yazarını alacağız
    double price; // fiyatını alacağız

    public Book() { // book objesi yaratıyoruz ve içine başta tanuımladığımız parametreleri belirliyoruz.

        title = "--";
        author = "--";
        price = 0;
    }

    public Book(String title, String author, double price) { // parametreleri kendisine eşitliyoruz this.something = something mesela.
        this.title = title;
        this.author = author;
        this.price = price;


    }
    public void showDetails(){ //burda da method yapıyoruz bize göstermesi için

        System.out.println(title + " // " + author + " // " + price);

    }
}

