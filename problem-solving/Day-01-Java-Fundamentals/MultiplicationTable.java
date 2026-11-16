
/*
 * Q5. Multiplication Table
 *
 * Problem:
 * Read integers N and K. Print the multiplication table
 * of N from 1 through K, one equation per line.
 *
 * Format:
 * N x i = product
 *
 * Input:
 * N K
 *
 * Expected Output:
 * K formatted lines
 *
 * Test Case 1:
 * Input:
 * 7 3
 *
 * Output:
 * 7 x 1 = 7
 * 7 x 2 = 14
 * 7 x 3 = 21
 *
 * Test Case 2:
 * Input:
 * 5 1
 *
 * Output:
 * 5 x 1 = 5
 */

import java.util.*;

class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        for (int i=1;i<=k;i++) {
            int product = n*i;
            System.out.println(n + " x " + i + " = " + product);
        }

        sc.close();
    }
}
