
/*
 * Q10. Equilibrium Index – Tough
 *
 * Problem:
 * Find the first index (0-based) where the sum of elements
 * to its left equals the sum of elements to its right.
 *
 * If no equilibrium index exists, print -1.
 *
 * Target Time Complexity: O(N)
 *
 * Input:
 * N followed by N integers.
 *
 * Test Case 1:
 * Input:
 * 5
 * 1 3 5 2 2
 *
 * Output:
 * 2
 *
 * Explanation:
 * Left sum  = 1 + 3 = 4
 * Right sum = 2 + 2 = 4
 * Therefore, equilibrium index = 2.
 *
 * Test Case 2:
 * Input:
 * 3
 * 1 2 3
 *
 * Output:
 * -1
 */

import java.util.Scanner;
class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }
        long leftSum = 0;
        int equilibriumIndex = -1;
        for (int i = 0; i < n; i++) {
            long rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                equilibriumIndex = i;
                break;
            }
            leftSum += arr[i];
        }
        System.out.println(equilibriumIndex);
        sc.close();
    }
}
