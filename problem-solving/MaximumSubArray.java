
/*
 * Q8. Maximum Subarray Sum – Tough
 *
 * Problem:
 * Given an integer array that may contain positive and
 * negative values, find the maximum sum of any
 * non-empty contiguous subarray.
 *
 * Constraint:
 * 1 <= N <= 100000
 *
 * Input:
 * N followed by N integers.
 *
 * Expected Output:
 * Maximum contiguous subarray sum.
 *
 * Test Case 1:
 * Input:
 * 8
 * -2 -3 4 -1 -2 1 5 -3
 *
 * Output:
 * 7
 *
 * Explanation:
 * Maximum subarray = [4, -1, -2, 1, 5]
 * Sum = 4 - 1 - 2 + 1 + 5 = 7
 *
 * Test Case 2:
 * Input:
 * 5
 * -8 -3 -6 -2 -5
 *
 * Output:
 * -2
 *
 * Explanation:
 * Maximum subarray = [-2]
 * Sum = -2
 */

import java.util.Scanner;
class MaximumSubarraySum {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arr[i],currentSum+arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println(maxSum);
        sc.close();
    }
}
