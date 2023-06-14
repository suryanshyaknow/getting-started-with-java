package org.example;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Library olib = new Library();
        System.out.println(olib);

        // Adding some books to the library
        olib.addBook("Sherlock Holmes Collection 1", "Sir Arthur Conan Doyle");
        olib.addBook("Sherlock Holmes Collection 2", "Sir Arthur Conan Doyle");
        olib.addBook("Hands-On Machine Learning with Scikit-Learn", "Aurelien Geron");
        olib.addBook("IGNITED MINDS", "Dr. A.P.J. Abdul Kalam");
        olib.addBook("IGNITED MINDS", "Dr. A.P.J. Abdul Kalam");

        olib.showAvailableBooks();

        // Issuing a book from the library
        olib.issueBook("IGNITED MINDS", "Dr. A.P.J. Abdul Kalam", "Suryansh");
        olib.issueBook("Sherlock Holmes Collection 2", "Sir Arthur Conan Doyle", "Spidey");
        olib.issueBook("Sherlock Holmes Collection 9", "Sir Arthur Conan Doyle", "Shady");

        olib.showAvailableBooks();

        // Returning the issued book to the library
        olib.returnIssuedBook("Sherlock Holmes Collection 9", "Sir Arthur Conan Doyle", "Spidey");
        olib.returnIssuedBook("IGNITED MINDS", "Dr. A.P.J. Abdul Kalam", "Spidey");
        olib.returnIssuedBook("IGNITED MINDS", "Dr. A.P.J. Abdul Kalam", "Suryansh");

        olib.showAvailableBooks();
        olib.getUserDb();

    }
}