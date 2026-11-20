
/*
 * Q9. Method Overloading – Calculator – Easy
 *
 * Problem:
 * Create overloaded methods named calculate:
 *
 * 1. One method adds two integers.
 * 2. One method adds three integers.
 * 3. One method adds two double values.
 *
 * Read an operation code and its operands.
 * Call the matching overloaded method and print the result.
 *
 * Input:
 * Operation code (1, 2, or 3) and corresponding operands.
 *
 * Test Case 1:
 * Input:
 * 1 12 8
 *
 * Output:
 * 20
 *
 * Test Case 2:
 * Input:
 * 3 2.5 1.25
 *
 * Output:
 * 3.75
 */

import java.util.Scanner;
class MethodOverloadingCalculator {
    static int calculate(int a, int b) {
        return a + b;
    }
    static int calculate(int a, int b, int c) {
        return a + b + c;
    }
    static double calculate(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println(calculate(num1, num2));
                break;
            case 2:
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                System.out.println(calculate(a, b, c));
                break;
            case 3:
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                System.out.println(calculate(x, y));
                break;
            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
