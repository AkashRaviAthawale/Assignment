// superclass
class Animal {
    void makeSound() {

        System.out.println("Animal makes a sound");
    }
}

// subclass Dog
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }

    void color() {
        System.out.println("Dog color is black");
    }
}

// subclass Cat
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }

    void breed() {
        System.out.println("Cat is American");
    }

    public static void main(String[] args) {

        // Upcasting
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();

        // Downcasting
        Dog dog = (Dog) myDog;
        Cat cat = (Cat) myCat;

        dog.color();
        cat.breed();

    }
}
