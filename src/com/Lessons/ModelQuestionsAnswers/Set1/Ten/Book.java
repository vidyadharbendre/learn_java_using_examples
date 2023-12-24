package Lessons.ModelQuestionsAnswers.Set1.Ten;

public class Book {
    private int serialNumber;
    private String author;
    private int publicationYear;

    // Constructor to initialize book details
    public Book(int serialNumber, String author, int publicationYear) {
        this.serialNumber = serialNumber;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Method to update author's name
    public void updateAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    // Method to update publication year
    public void updatePublicationYear(int newPublicationYear) {
        this.publicationYear = newPublicationYear;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Serial Number: " + this.serialNumber);
        System.out.println("Author: " + this.author);
        System.out.println("Publication Year: " + this.publicationYear);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating book instances using the constructor
        Book book1;
        book1 = new Book(1, "Effective Java by Joshua Bloch", 2008);
        Book book2;
        book2 = new Book(2, "Head First Java by Kathy Sierra and Bert Bates", 2005);

        // Displaying initial book details
        System.out.println("Initial Book Details:");
        book1.displayDetails();
        book2.displayDetails();

        // Updating book details using methods
        book1.updateAuthor("Joshua Bloch (Updated)");
        book2.updatePublicationYear(2019);

        // Displaying updated book details
        System.out.println("Updated Book Details:");
        book1.displayDetails();
        book2.displayDetails();
    }
}
// The output of the above program is shown as below:
/*
Initial Book Details:
Book Serial Number: 1
Author: Effective Java by Joshua Bloch
Publication Year: 2008

Book Serial Number: 2
Author: Head First Java by Kathy Sierra and Bert Bates
Publication Year: 2005

Updated Book Details:
Book Serial Number: 1
Author: Joshua Bloch (Updated)
Publication Year: 2008

Book Serial Number: 2
Author: Head First Java by Kathy Sierra and Bert Bates
Publication Year: 2019
 */
