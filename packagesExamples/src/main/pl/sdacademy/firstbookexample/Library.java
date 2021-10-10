package pl.sdacademy.firstbookexample;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Quo Vadis", "Henryk Sienkiewicz", 230, 50.0f);
        book.author = "H. Sienkiewicz";
        book.setAuthor("H. Sienkiewicz");
        System.out.println(book);

        Book anotherBook = new Book("Krzyżacy", "H. Sienkiewicz", 360, 60.0f);
        System.out.println(book);
        System.out.println(anotherBook);

        Book thirdBook = new Book("Ogniem i mieczem", "H. Sienkiewicz", 360, 60.0f);
        System.out.println(thirdBook);

        System.out.println(anotherBook);
        Book.raiseBookPrice(anotherBook, 10.0f);
        System.out.println(anotherBook);
        anotherBook.raiseBookPrice(10.0f);
        System.out.println(anotherBook);

        String allBooks = String.join(", ", book.getTitle(), anotherBook.getTitle(),
                thirdBook.getTitle());
        System.out.println(allBooks);
    }
}
