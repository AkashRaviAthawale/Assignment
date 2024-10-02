public class Student_Object_Q1 {
    // attribute
    String name;
    int rollNumber;
    String grade;
    double marks;

    // constructor

    Student_Object_Q1(String name, int rollNumber, String grade, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.marks = marks;
    }

    // display
    public void displayDetails() {

        System.out.println("Name : " + name);
        System.out.println("RN : " + rollNumber);
        System.out.println("Grade : " + grade);
        System.out.println("Marks : " + marks);
    }

    // main
    public static void main(String[] args) {

        // create obj
        Student_Object_Q1 std = new Student_Object_Q1("Akash Athawale", 7, "84.7", 677);

        // display
        std.displayDetails();
    }

}
