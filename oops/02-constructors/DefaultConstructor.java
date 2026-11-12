
/*
 * Topic: Default Constructor
 *
 * A default constructor is provided by the compiler
 * when no constructor is explicitly declared.
 */

class Employee {

    int employeeId;
    String employeeName;
    double salary;
    boolean isPermanent;

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Permanent: " + isPermanent);
    }
}

public class DefaultConstructor {

    public static void main(String[] args) {

        // Compiler-provided default constructor is called
        Employee emp = new Employee();

        // Display default values
        emp.displayDetails();
    }
}
