package Encapsulation;

import java.util.List;

public class LibraryMain {
    public static void main(String[] args) {

        Library myLibrary = new Library();

        myLibrary.addBook("Java Programming");
        myLibrary.addBook("Data Structures");
        myLibrary.addBook("Python Basics");

        System.out.println("------------------------------------");

        List<String> currentBooks = myLibrary.getBook();
        System.out.println("Books in Library: " + currentBooks);

        System.out.println("------------------------------------");
        myLibrary.removeBook("Data Structures");

        myLibrary.removeBook("C++");

        System.out.println("------------------------------------");

        System.out.println("Final Book List: " + myLibrary.getBook());
    }
}