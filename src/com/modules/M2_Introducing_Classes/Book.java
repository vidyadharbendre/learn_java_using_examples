package modules.M2_Introducing_Classes;

public class Book {
    private String title;     // Attribute: title
    private String author;    // Attribute: author
    private int pageCount;    // Attribute: pageCount
    private boolean isAvailable;  // Attribute: isAvailable

    // Constructor to initialize Book objects
    public Book(String title, String author, int pageCount) {
        this.title = title;           // Initialize title attribute
        this.author = author;         // Initialize author attribute
        this.pageCount = pageCount;   // Initialize pageCount attribute
        this.isAvailable = true;      // Initialize isAvailable attribute
    }

    // Getter methods to access individual attributes
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter method to modify isAvailable attribute
    public void setAvailability(boolean available) {
        this.isAvailable = available;
    }

    // Method to display information about the book
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Page Count: " + pageCount + ", Available: " + isAvailable);
    }

    public static void main(String[] args) {
        // Creating an object (instance) of the Book class
        Book myBook = new Book("Java Programming", "John Doe", 300);

        // Accessing and displaying the state of the object
        myBook.displayInfo();
    }
}
