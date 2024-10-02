public class Person_Object_Q2 {

    String name;
    int age;
    String city;

    Person_Object_Q2(String name, int age, String city) {

        this.name = name;
        this.age = age;
        this.city = city;
    }

    public void dispalyDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("City : " + city);
        System.out.println();
    }

    public static void main(String[] args) {

        Person_Object_Q2 person1 = new Person_Object_Q2("Akash", 22, "Akola");
        Person_Object_Q2 person2 = new Person_Object_Q2("Salman", 58, "Mumbai");
        Person_Object_Q2 person3 = new Person_Object_Q2("Virat", 32, "Delhi");

        person1.dispalyDetails();
        person2.dispalyDetails();
        person3.dispalyDetails();
    }

}
