package com.Modules.M3_Inheritance.S7_07_Using_Abstract_Classes.C5_05_Real_Time_Examples;

public class E4_Library_Management_System {
    public static void main(String[] args) {
        LibrarySystem librarySystemRefObj;
        librarySystemRefObj = new LibrarySystem();

        librarySystemRefObj.issueBook("Java Programming", "Vidyadhar Bendre");
        librarySystemRefObj.returnBook("Java Programming");
        librarySystemRefObj.displayAvailableBooks();
    }
}

abstract class Library{
    abstract void issueBook(String bookTitle, String borrower);
    abstract void returnBook(String bookTitle);
    abstract void displayAvailableBooks();
}

class LibrarySystem extends Library{
    @Override
    void issueBook(String bookTitle, String borrower) {
        System.out.println("Book '" + bookTitle + " ' issued to "+ borrower);
    }

    @Override
    void returnBook(String bookTitle) {
        System.out.println("Book '" + bookTitle + " 'returned");
    }

    @Override
    void displayAvailableBooks() {
        System.out.println("List of available books in the library");
    }
}

// The output of the above program is shown as below:
/*

Book 'Java Programming ' issued to Vidyadhar Bendre
Book 'Java Programming 'returned
List of available books in the library

 */
