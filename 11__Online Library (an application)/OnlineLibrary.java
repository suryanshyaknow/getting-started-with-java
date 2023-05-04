
public class OnlineLibrary {

    private String[] books;
    int nBooks = 0;

    public OnlineLibrary() {
        int size = 50;
        books = new String[size];
        System.out.println("\nAn online library containing spacees for " + size + " books has been established!");
    }

    public OnlineLibrary(int size) {
        books = new String[size];
        System.out.println("\nAn online library containing spaces for " + size + " books has been established!");
    }

    public void addBook(String bookName) {
        books[nBooks] = bookName;
        nBooks += 1;

        System.out.println("\nYour book \"" + bookName + "\" has been added to our repository.");
        System.out.println("Thankyou! We look forward to your assistance in future again. :)");
    }

    public void issueBook(String bookName) {
        for (int i = 0; i < nBooks; i++) {
            if (books[i].equals(bookName)) {
                System.out.println(
                        "We have successfully issued the book \"" + bookName + "\" for ya.\nArigato-gosai-masu! :)");

                // Removing the book from the repository
                for (int j = i; j < nBooks; j++) {
                    books[j] = books[j + 1];
                }

                books[nBooks - 1] = null; // Set the last book to `null`
                nBooks--;
                return;
            }
        }
        System.out.println("Unfortunately, we currently do not have the book you asked for. Kindly visit us again!");
    }

    public void showAvailableBooks() {
        System.out.println("\nAvailable books in our library at the time are: ");

        int idx = 0;
        for (String book : books) {
            if (idx == nBooks - 1) {
                System.out.println("and " + book);
                System.out.println();
                break;
            }

            if (book == null) {
                return;
            }

            System.out.println(book + ", ");
            idx += 1;
        }
    }

    public static void main(String[] args) {

        OnlineLibrary olib = new OnlineLibrary();

        // Adding books to the library
        olib.addBook("Hands-On Machine Learning with Scikit-Learn by Aurelien Geron");
        olib.addBook("Sherlock Holmes by Sir Arthur Conan Doyle");
        olib.addBook("the 3 mistakes of my life by Chetan Bhagat");
        olib.addBook("IGNITED MINDS by Dr. A.P.J. Abdul Kalam");

        // Showing available books
        olib.showAvailableBooks();

        // Issuing a book
        olib.issueBook("Sherlock Holmes by Sir Arthur Conan Doyle");

        // Showing available books, again
        olib.showAvailableBooks();

    }

}
