package pl.sdacademy.firstbookexample;

public class Book {
    static int numberOfCreatedBooks = 0;
    String title;
    String author;
    int numberOfPages;
    private float price;

    public Book(String title, String author, int numberOfPages, float price) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.price = price;
        numberOfCreatedBooks++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void raiseBookPrice(float price) {
        this.price += price;
    }

    public static Book raiseBookPrice(Book book, float price) {
        book.setPrice(book.price + price);
        return book;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", numberOfCreatedBooks=" + numberOfCreatedBooks +
                '}';
    }
}
