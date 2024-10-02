// Problem:
// Write a Java program that performs the following operations using the List interface (you can use ArrayList):

// Input student data: Allow the user to input multiple students with attributes such as student ID (integer), name (string), and marks (float)..
// Sort the students by marks: Sort the list of students in descending order based on their marks.
// Find the top student: After sorting, print the details of the student with the highest marks.
// Search for a student by ID: Allow the user to input a student ID and search for the corresponding student in the list. If found, print the student details; otherwise, display a message that the student does not exist.
// Remove students with marks less than 40: Remove all students with marks less than 40 from the list and display the updated list of students.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    int id;
    String name;
    float marks;

    public Student(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [ ID:" + id + ", Name :" + name + ", Marks: " + marks + "]";
    }
}

public class StudentManagement {

    public static void main(String[] args) {
        ArrayList<Student> stud = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Input stud data...
        System.out.println("Enter student data :: ");

        int i = 0;
        while (i < 4) {
            System.out.println("Enter student id :");
            int id = sc.nextInt();

            System.out.println("Enter student name :");
            String name = sc.nextLine();

            System.out.println("Enter student marks:");
            float marks = sc.nextFloat();

            stud.add(new Student(id, name, marks));

            i++;

        }

        // sort students bt marks in descending order

        Collections.sort(stud, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Float.compare(s2.marks, s1.marks);
            }
        });

        // top student
        Student topStudent = stud.get(0);
        System.out.println("\n Top student: " + topStudent);

        // found student id
        System.out.println("\nEnter the ID of the student you want to search:");
        int searchId = sc.nextInt();
        boolean found = false;
        for (Student s : stud) {
            if (s.id == searchId) {
                System.out.println("Student found: " + s);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + searchId + " not found.");
        }

        // remove
        stud.removeIf(s -> s.marks < 40);

        // Display the list
        System.out.println("Updated student list");
        for (Student student : stud) {
            System.out.println(student);
        }

        sc.close();
    }

}
