package pl.sdacademy;

import pl.sdacademy.secondbookexample.Book;

public class RentingSystem {
    private Book[] booksToRent;

    public RentingSystem(Book[] booksToRent) {
        this.booksToRent = booksToRent;
    }

    public Book[] getBooksToRent() {
        return new Book[]{};
    }

    public void addBookToCollection(Book newBook) {
        Book[] newBooksToRent = new Book[booksToRent.length + 1];
        for (int i = 0; i < booksToRent.length; i++) {
            newBooksToRent[i] = booksToRent[i];
        }
        newBooksToRent[booksToRent.length] = newBook;
        booksToRent = newBooksToRent;
    }

    public Book rentBook(String title) {
        for (Book book : booksToRent) {
            if (title.equals(book.getTitle()) && !book.getIsRent()) {
                book.setRent(true);
                return book;
            }
        }
        return null;
    }

    // Zadanie 1
    // napisac cialo tej metody do zwracania ksiazek do systemu
    public void returnBook(String title) {

        }
    }

