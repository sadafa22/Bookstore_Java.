public class Stock {
    //attributes
    private String bookName;
    private String author;
    private double price;


    public Stock(String bookName, String author, double price) {
       //complete the constructor
        this.bookName=bookName;
        this.author=author;
        this.price=price;
    }
    //complete the getters()
    public String getBookName() {

        return this.bookName;
    }

    public String getAuthor() {

        return this.author;
    }

    public double getPrice() {
        return this.price;
    }
}
