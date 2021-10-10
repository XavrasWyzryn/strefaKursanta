package pl.sdacademy;

import pl.sdacademy.firstbookexample.Book;
import static java.lang.Math.PI;

public class Library {
    public static void main(String[] args) {
        Book firstBook = new Book("Tkacz iluzji", "Ewa Bialolecka", 250, 30.0f);
        firstBook.setAuthor("E. Bialolecka");
        pl.sdacademy.secondbookexample.Book secondBook = new pl.sdacademy.secondbookexample.Book(
                "Potop", "Henryk Sienkiewicz", 450, 35.99f);

        double r = 5.0d;
        double roundBorder = 2 * PI * r;
    }
}
