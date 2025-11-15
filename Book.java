class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor 1
    Book(String t, String a) {
        title = t;
        author = a;
        price = 0.0;    // Price not provided
    }

    // Parameterized constructor 2
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

class BookTest {
    public static void main(String[] args) {

        Book b1 = new Book();                     // Default
        Book b2 = new Book("Wings of Fire", "APJ Abdul Kalam");  // Title + author
        Book b3 = new Book("Java Basics", "Herbert Schildt", 450.0); // All fields

        b1.display();
        b2.display();
        b3.display();
    }
}
