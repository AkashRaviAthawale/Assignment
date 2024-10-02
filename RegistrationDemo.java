import java.util.Scanner;

class InvalidAgeException extends Exception {
    String str;

    public InvalidAgeException(String message) {
        this.str = message;
    }
}

public class RegistrationDemo {

    public static void user(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 ");
        } else {
            System.out.println("Registration Successfull");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        try {
            user(age);
        } catch (InvalidAgeException e) {
            System.out.println("Registration failed " + e.getMessage());
        } finally {
            System.out.println("Registration Complete ");
            sc.close();
        }

        System.out.println("-----------------------------------------------------------");

    }

}
