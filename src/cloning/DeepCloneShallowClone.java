package cloning;


import java.util.ArrayList;
import java.util.List;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(Book other) {
        this.title = other.title;
        this.author = other.author;
    }
}

class Library {
    String name;
    List<Book> books;

    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    Library(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    void addBook(Book book) {
        books.add(book);
    }

    Library shallowClone() {
        return new Library(this.name, this.books);
    }

    Library deepClone() {
        List<Book> copiedBooks = new ArrayList<>();

        for (Book book : this.books) {
            copiedBooks.add(new Book(book));
        }

        return new Library(this.name, copiedBooks);
    }

    void display() {
        System.out.println("Library : " + name);

        for (Book book : books) {
            System.out.println("Book : " + book.title + ", Author : " + book.author);
        }
    }
}

public class DeepCloneShallowClone {
    public static void main(String[] args) {
        Library originalLibrary = new Library("Central_Library");

        originalLibrary.addBook(new Book("Frankestein", "Mary_Shelley"));
        originalLibrary.addBook(new Book("King_Arthur_and_the_Round_Table", "Rosemary_Sutcliff"));

        Library shallowClone = originalLibrary.shallowClone();
        Library deepClone = originalLibrary.deepClone();

        System.out.println("Original Library :");
        System.out.println();

        originalLibrary.display();

        originalLibrary.books.get(1).title = "Treasure_Island";
        originalLibrary.books.get(1).author = "Robert_Louis_Stevenson";

        System.out.println();
        System.out.println("After Modifications :");
        System.out.println();

        System.out.println("Original Library :");
        System.out.println();

        originalLibrary.display();

        System.out.println();
        System.out.println("Shallow Clone :");
        System.out.println();

        shallowClone.display();

        System.out.println();
        System.out.println("Deep Clone :");
        System.out.println();

        deepClone.display();
    }
}
