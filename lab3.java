import java.io.*;

// Book class
class Book {
    // Data members
    private String title;
    private String author;
    private double price;

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : $" + price);
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        Book book2 = new Book("1984", "George Orwell", 8.50);

        // Displaying book details
        System.out.println("Book 1 Details:");
        book1.displayDetails();

        System.out.println("Book 2 Details:");
        book2.displayDetails();
    }
}
