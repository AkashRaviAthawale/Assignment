class Person_In_Q1 {

    String name;
    int age;
    String address;

    public Person_In_Q1(String name, int age, String address) {

        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayDetails() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Address : " + address);
    }

}

class Emplyoee extends Person_In_Q1 {

    String emplyoeeID;

    public Emplyoee(String name, int age, String address, String emplyoeeID) {
        super(name, age, address);
        this.emplyoeeID = emplyoeeID;

    }

    // display emplyoee details

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Emplyoee ID : " + emplyoeeID);
    }

    public static void main(String[] args) {

        Emplyoee emp = new Emplyoee("Akash Athawale", 22, "183,near gov. warehouse ,akola", "Akash1107");
        emp.displayDetails();
    }
}
