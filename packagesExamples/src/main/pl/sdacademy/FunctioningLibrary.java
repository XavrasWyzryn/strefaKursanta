package pl.sdacademy;

import pl.sdacademy.secondbookexample.Book;

public class FunctioningLibrary {
    public static void main(String[] args) {
        Book firstBook = new Book("Quo Vadis", "Henryk Sienkiewicz", 230, 50.0f);
        Book secondBook = new Book("Krzyżacy", "H. Sienkiewicz", 360, 60.0f);
        Book thirdBook = new Book("Ogniem i mieczem", "H. Sienkiewicz", 360, 60.0f);

        Book[] threeBooks = new Book[]{firstBook, secondBook, thirdBook};

        RentingSystem rentingSystem = new RentingSystem(threeBooks);

        Book rentBook = rentingSystem.rentBook("Harry Potter");
        System.out.println(rentBook);

        rentingSystem.addBookToCollection(new Book("Harry Potter", "J. K. Rowling",
                320, 27.50f));

        Book secondRentBook = rentingSystem.rentBook("Harry Potter");
        System.out.println(secondRentBook);

        Book thirdRentBook = rentingSystem.rentBook("Harry Potter");
        System.out.println(thirdRentBook);
    }
}
