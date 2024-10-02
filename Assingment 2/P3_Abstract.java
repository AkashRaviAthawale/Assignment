abstract class Shape {
    // Abstract method to calculate area
    abstract double calculateArea();
}

// Subclass Circle extends Shape
class Circle extends Shape {
    double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement calculateArea method
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Rectangle extends Shape
class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor to initialize width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implement calculateArea method
    double calculateArea() {
        return width * height;
    }
}

public class P3_Abstract {

    // Main class to test the implementation
    public static void main(String[] args) {
        // // Create Circle and Rectangle objects
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        // // Calculate and print the area of the shapes
        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
    }
}