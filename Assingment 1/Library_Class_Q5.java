
public class Library_Class_Q5 {

    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable = true;

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // setters

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " you can borrowed.");
        } else {
            System.out.println(title + " is currently not available.");
        }
    }

    // Method to return the book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " has been returned and now is available.");
        } else {
            System.out.println(title + " its available already.");
        }
    }

    public static void main(String[] args) {

        Library_Class_Q5 book = new Library_Class_Q5();

        book.setIsbn("91-9689447573");
        book.setTitle("Java Dvelopment");
        book.setAuthor("Akash Athawale");

        // Displaying availability
        System.out.println("Is '" + book.getTitle() + "' available? " + book.isAvailable());

        // Borrowing the book
        book.borrowBook(); // you can borrow

        // Trying to borrow the book again
        book.borrowBook(); // you can not borrow

        // Returning the book
        book.returnBook();

    }
}