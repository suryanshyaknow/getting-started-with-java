package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Demonstration of how javadoc is generated as per industry standards.
 *
 * @author Suryansh Grover
 * @version 0.0.1
 * @see <a href="https://docs.oracle.com/en/java/javase/17/docs/api/index.html" target="_blank">Java Docs</a>
 * @since 2023
 */

public class Library {

    private ArrayList<Book> books;
    int size = 0;
    int nBooks = 0;
    Map<String, BookInfo> userDb = new HashMap<>(); // User Central Database

    public Library() {
        this.books = new ArrayList<>(); // with initial size of 10
        System.out.println("\nAn online library containing spaces for 10 books has been established!");
    }

    public Library(int size) {
        this.books = new ArrayList<>(size);
        System.out.println("\nAn online library containing spaces for " + size + " books has been established!");
    }

    public void showAvailableBooks() {

        if (this.nBooks == 0) {
            System.out.println("There are no available books at the time in our repository. Kindly visit us again!");
            return;
        }
        System.out.println("\nAvailable books in our library at the time are: ");

        int bookCount = 1;
        for (Book book : this.books) {
            System.out.println(bookCount + ". " + book.getBookName() + " by " + book.getAuthor());
            bookCount += 1;
        }
    }

    /**
     * This method adds the specified (through the params) book into the library's repository
     * and prints a message to confirm the same.
     *
     * <p><b>NOTE:</b> We can also keep track of the number of copies of a specific book in the library.
     * Whenever a book is borrowed or returned, the count will be updated accordingly. If the
     * count reaches zero, we can remove the entry for that book.</p>
     * <p>However, this implementation would be currently redundant.</p>
     *
     * @param bookName Name of the book to be added to the library's repo.
     * @param author   Name of the author of the book to be added to the library's repo.
     */
    public void addBook(String bookName, String author) {

        // Creating an instance of the desired Book
        Book book = new Book(bookName, author);

        // Adding the said book to the library
        this.books.add(book);
        nBooks += 1;

        System.out.println("\nYour book \"" + bookName + "\" has been added to our library.");
        System.out.println("Thankyou! We look forward to your assistance in future again. :)");

        /**
         * NOTE: We can also keep track of the number of copies of a specific book in the library.
         * Whenever a book is borrowed or returned, the count will be updated accordingly. If the
         * count reaches zero, we can remove the entry for that book.
         *
         * However, this implementation would be currently redundant.
         */
    }

    public void issueBook(String bookName, String bookAuthor, String borrower) {

        // Getting the desired book from the repository
        Book desiredBook = new Book(bookName, bookAuthor);
        if (this.books.contains(desiredBook)) {
            this.books.remove(desiredBook);
            nBooks -= 1;
            System.out.println("We have successfully issued the book \"" + bookName + "\" by " + bookAuthor + " for ya.\nArigato-gosai-masu! :)");
        } else {
            System.out.println("Unfortunately, we currently do not have the book you asked for. Kindly visit us again!");
            return;
        }

        // Logging Issuance details in the User Central Database
        BookInfo info = new BookInfo(borrower, LocalDateTime.now(), null);
        this.userDb.put(bookName, info);
    }

    public void returnIssuedBook(String bookName, String bookAuthor, String borrower) {
        Book book = new Book(bookName, bookAuthor);
        if (userDb.containsKey(bookName)) {
            if (userDb.get(bookName).getIssuedTo().equals(borrower)) {
            } else {
                System.out.println("We have not fuckin' lent you any such book in the past!");
                return;
            }
        } else {
            System.out.println("We have not even had any such book, you sure you've lent it from here only?");
            return;
        }

        // Adding the book back to the library
        this.books.add(book);
        nBooks += 1;

        // Logging Issuance details in the User Central Database
        BookInfo retrievedInfo = this.userDb.get(bookName);
        retrievedInfo.setReturnedOn(LocalDateTime.now());

        System.out.println("You've successfully returned the said book.");
        System.out.println("Thankyou for visiting us! We look forward to seeing you again. :)");
    }

    public void getUserDb() {
        System.out.println("Getting the User Central Database...");
        System.out.println(userDb);
    }

}