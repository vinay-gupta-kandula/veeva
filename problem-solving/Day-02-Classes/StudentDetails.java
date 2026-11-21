/*
 * Q1. Student Details – Easy
 *
 * Problem:
 * Create a Student class with private roll number, name and marks.
 * Initialize them through a constructor and provide a method
 * to display the student details.
 *
 * Read one student's data and display the details
 * in the specified order.
 *
 * Input:
 * Roll number, name, marks
 *
 * Expected Output:
 * RollNo: value
 * Name: value
 * Marks: value
 *
 * Test Case 1:
 * Input:
 * 101 Ravi 86.5
 *
 * Output:
 * RollNo: 101
 * Name: Ravi
 * Marks: 86.5
 *
 * Test Case 2:
 * Input:
 * 12 Anu 91
 *
 * Output:
 * RollNo: 12
 * Name: Anu
 * Marks: 91.0
 */

import java.util.Scanner;
class Student{
    private int rollNo;
    private String name;
    private double marks;

    Student(int rollNo, String name, double marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public void displayDetails(){
        System.out.println("RollNo: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rollNo = sc.nextInt();
        String name = sc.next();
        double marks = sc.nextDouble();
        Student s1 = new Student(rollNo, name, marks);
        s1.displayDetails();
        sc.close();
    }
}