
public class Emplyoee_Class_Q2 {

    private String name;
    private int id;
    private String department;
    private double salary;

    // calculate salary
    public double calculateSalary(double salary) {
        return salary * 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Emplyoee_Class_Q2 emplyoee = new Emplyoee_Class_Q2();
        emplyoee.setName("Akash");

        System.out.println("Annual Salary of " + emplyoee.getName() + ": " + emplyoee.calculateSalary(3200));
    }

}
