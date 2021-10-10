package pl.sdacademy.firstbookexample;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Quo Vadis", "Henryk Sienkiewicz", 230, 50.0f);
        book.author = "H. Sienkiewicz";
        book.setAuthor("H. Sienkiewicz");
    }
}
