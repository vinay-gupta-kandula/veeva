/*
 * Topic: Constructor Chaining
 *
 * this() calls another constructor
 * within the same class.
 */

class Student {

    int id;
    String name;
    String department;

    // Constructor 1
    Student() {

        this(101, "Vinay"); //calling two-parameter constructor

        System.out.println("No-argument constructor executed");
    }

    // Constructor 2
    Student(int id, String name) {

        this(id, name, "CSE"); //calling three-parameter constructor

        System.out.println("Two-parameter constructor executed");
    }

    // Constructor 3
    Student(int id, String name, String department) {

        this.id = id;
        this.name = name;
        this.department = department;

        System.out.println("Three-parameter constructor executed");
    }

    void display() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class ConstructorChaining {

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println("Student Details:");

        s1.display();
    }
}