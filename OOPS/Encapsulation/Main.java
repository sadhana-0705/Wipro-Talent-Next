// 1. Author Class Definition
class Author {
    private String name;
    private String email;
    private char gender;

    // Parameterized Constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters and Setters for Author (Good practice for Encapsulation)
    public String getName() { return name; }
    public String getEmail() { return email; }
    public char getGender() { return gender; }

    @Override
    public String toString() {
        return "Author[Name=" + name + ", Email=" + email + ", Gender=" + gender + "]";
    }
}

// 2. Book Class Definition
class Book {
    private String name;
    private Author author; // Composition: Book has an Author
    private double price;
    private int qtyInStock;

    // Parameterized Constructor
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Author getAuthor() { return author; }
    public void setAuthor(Author author) { this.author = author; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQtyInStock() { return qtyInStock; }
    public void setQtyInStock(int qtyInStock) { this.qtyInStock = qtyInStock; }
}

// 3. Main Class to Test the Functionality
public class Main {
    public static void main(String[] args) {
        // Create an Author object
        Author writer = new Author("J.K. Rowling", "jkrowling@example.com", 'F');

        // Create a Book object using the Author object
        Book myBook = new Book("Harry Potter", writer, 29.99, 150);

        // Print all details of the book including author details
        System.out.println("--- Book Details ---");
        System.out.println("Book Title: " + myBook.getName());
        System.out.println("Price: $" + myBook.getPrice());
        System.out.println("Quantity in Stock: " + myBook.getQtyInStock());
        
        System.out.println("\n--- Author Details ---");
        System.out.println("Author Name: " + myBook.getAuthor().getName());
        System.out.println("Author Email: " + myBook.getAuthor().getEmail());
        System.out.println("Author Gender: " + myBook.getAuthor().getGender());
    }
}
