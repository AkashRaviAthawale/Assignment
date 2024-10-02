class Vehical_In_Q4 {
    String make;
    String model;
    int year;

    public Vehical_In_Q4(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
    }

}

class Truck extends Vehical_In_Q4 {

    double cargoCapacity;

    public Truck(String make, String model, int year, double cargoCapacity) {
        super(make, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    public void displayDetails() {
        super.displayDetails();
    }

    public static void main(String[] args) {

        Truck truck = new Truck("Ford", "F-200", 2015, 3.5);
        truck.displayDetails();

    }
}