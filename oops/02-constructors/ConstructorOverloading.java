
/*
 * Topic: Constructor Overloading
 *
 * Multiple constructors in the same class
 * with different parameter lists.
 */

class Employee {

    int id;
    String name;
    String department;
    double salary;

    // Constructor 1: No parameters
    Employee() {

        id = 0;
        name = "Unknown";
        department = "Not Assigned";
        salary = 0.0;
    }

    // Constructor 2: Two parameters
    Employee(int id, String name) {

        this.id = id;
        this.name = name;
        department = "Not Assigned";
        salary = 0.0;
    }

    // Constructor 3: Four parameters
    Employee(int id, String name,
             String department, double salary) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("------------------");
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee(101, "Vinay");

        Employee e3 = new Employee(
            102, "Rahul", "Development", 45000
        );

        e1.display();
        e2.display();
        e3.display();
    }
}
