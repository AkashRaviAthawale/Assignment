public class Pet_Object_Q5 {
    // Attributes
    String name;
    String type; // e.g., "Dog", "Cat", etc.
    int age;
    String owner;

    // Constructor
    Pet_Object_Q5(String name, String type, int age, String owner) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.owner = owner;
    }

    // pet's details display
    void displayDetails() {
        System.out.println("Pet Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age + " years");
        System.out.println("Owner: " + owner);
        System.out.println();
    }

    // Main methode
    public static void main(String[] args) {
        // Creating an object of the Pet class
        Pet_Object_Q5 pet1 = new Pet_Object_Q5("Doggy", "Dog", 3, "Akash Athawale");
        Pet_Object_Q5 pet2 = new Pet_Object_Q5("Sweety", "Cat", 5, "Alice John");
        Pet_Object_Q5 pet3 = new Pet_Object_Q5("Buddy", "Lion", 7, "Ahemad Shaikh");

        // Displaying the pet's details
        pet1.displayDetails();
        pet2.displayDetails();
        pet3.displayDetails();
    }
}
