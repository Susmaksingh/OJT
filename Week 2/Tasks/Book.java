public class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(String isbn, String title, String author, boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book '" + title + "' has been borrowed.");
        } else {
            System.out.println("The book '" + title + "' is currently unavailable.");
        }
    }

    // Method to return a book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("The book '" + title + "' has been returned.");
        } else {
            System.out.println("The book '" + title + "' was not borrowed.");
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        // Create some book objects
        Book book1 = new Book("978-0134685991", "Java", "Joshua", true);
        Book book2 = new Book("978-0596009205", "First Java", "Sierra", true);

        // Display book details
        book1.displayBookDetails();
        book2.displayBookDetails();

        // Borrow and return books
        book1.borrowBook();
        book1.borrowBook(); // Attempt to borrow again, should be unavailable
        book1.returnBook();
        book1.returnBook(); // Attempt to return again, should not be borrowed

        // Display book details again
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
