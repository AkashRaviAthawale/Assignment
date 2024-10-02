public class Car_Object_Q3 {
    // Attributes
    String make;
    String model;
    int year;
    double price;

    // Constructor
    Car_Object_Q3(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Car's details
    void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println(); // Blank line for better readability
    }

    // Main
    public static void main(String[] args) {
        // Creating multiple objects of the Car class
        Car_Object_Q3 car1 = new Car_Object_Q3("Toyota", "Camry", 2020, 24000);
        Car_Object_Q3 car2 = new Car_Object_Q3("Honda", "Civic", 2019, 22000);
        Car_Object_Q3 car3 = new Car_Object_Q3("Ford", "Mustang", 2021, 35000);

        // Displaying
        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
    }
}
