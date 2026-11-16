
/*
 * Q6. Rotate Array Right 
 *
 * Problem:
 * Given an array of N integers and an integer K, rotate the array
 * right by K positions. K may be greater than N.
 * Preserve the relative order after rotation.
 *
 * Input:
 * N
 * Array elements
 * K
 *
 * Expected Output:
 * Rotated array elements separated by spaces.
 *
 * Test Case 1:
 * Input:
 * 5
 * 1 2 3 4 5
 * 2
 *
 * Output:
 * 4 5 1 2 3
 *
 * Test Case 2:
 * Input:
 * 4
 * 8 6 2 1
 * 6
 *
 * Output:
 * 2 1 8 6
 */

import java.util.*;

class RotateArrayRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k = k % n;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            rotated[newIndex] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
        sc.close();
    }
}
