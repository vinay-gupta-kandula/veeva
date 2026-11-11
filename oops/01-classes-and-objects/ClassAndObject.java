
/*
 * Topic: Classes and Objects
 * Day: 01
 *
 * Description:
 * A class is a blueprint used to create objects.
 * An object is an instance of a class.
 *
 * Real-world example:
 * A Student class represents the common structure
 * of students in a college.
 *
 * Each student object maintains its own data.
 */

class Student {

    // Instance variables-- Each object gets its own copy of these variables.
    int rollNumber;
    String name;
    double marks;

    // Instance method
    // Displays the details of a student.
    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("---------------------");
    }
}

public class ClassAndObject {

    public static void main(String[] args) {

        // Creating the first Student object
        Student s1 = new Student();

        s1.rollNumber = 101;
        s1.name = "Vinay";
        s1.marks = 92.5;

        // Creating the second Student object
        Student s2 = new Student();

        s2.rollNumber = 102;
        s2.name = "Rahul";
        s2.marks = 88.5;

        // Calling methods using objects
        s1.displayDetails();
        s2.displayDetails();
    }
}
