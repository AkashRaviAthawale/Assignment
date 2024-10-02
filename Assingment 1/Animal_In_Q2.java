public class Animal_In_Q2 {
    String species;
    int age;

    public Animal_In_Q2(String species, int age) {
        this.species = species;
        this.age = age;
    }

    // display animal method

    public void displayDetails() {
        System.out.println("Species : " + species);
        System.out.println("Age : " + age);
    }
}

class Dog extends Animal_In_Q2 {

    String breed;

    public Dog(String species, int age, String breed) {
        super(species, age);
        this.breed = breed;
    }

    // display dog details

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Dog breed : " + breed);
    }

    public void bark() {
        System.out.println("woof! woof! ...");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Canin", 4, "Labror");

        dog.displayDetails();

        dog.bark();
    }

}
