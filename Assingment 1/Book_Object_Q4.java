public class Book_Object_Q4 {
    // Attributes

    String title;
    String author;
    String isbn;
    double price;

    // constructor
    Book_Object_Q4(String title, String author, String isbn, double price) {

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    // Apply discount

    public void applyDiscount(double percentage) {

        if (percentage > 0 && percentage <= 100) {
            price -= (price * (percentage / 100));
        } else {
            System.out.println("invalid value");
        }
    }

    // display
    public void display() {

        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("isbn : " + isbn);
        System.out.println("Price : " + price);
    }

    // main
    public static void main(String[] args) {

        Book_Object_Q4 book = new Book_Object_Q4("Java programming", "San Andrey", "91-9269299440", 1200);

        // display
        book.display();

        System.out.println();

        // after apply display
        System.out.println("After apply display");
        book.applyDiscount(15);
        book.display();

    }

}
