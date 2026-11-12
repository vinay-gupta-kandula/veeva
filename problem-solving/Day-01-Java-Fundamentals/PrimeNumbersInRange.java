/*Q2. Prime Numbers in a Range – Moderate 
Problem: Print all prime numbers between L and R, inclusive, in ascending order. If no prime exists, 
print None. Constraints: 1 ≤ L ≤ R ≤ 100000. 
Input: L R 
Expected Output: Primes separated by one space, or None 
Test Cases: 
Input: 10 20 
Output: 11 13 17 19 
Input: 24 28 
Output: None */


import java.util.*;
class PrimeNumbersInRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int v1=sc.nextInt();
        int v2=sc.nextInt();
        boolean found = false;

        for(int i = v1; i <= v2; i++) {
            if(isPrime(i)) {
                if(found) {
                    System.out.print(" ");
                }
                System.out.print(i);
                found = true;
            }
        }

        if (!found) {
            System.out.print("None");
        }

        System.out.println();
        sc.close();
    }

    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }

        for(int i = 2; i*i <= n; i++) {
            if(n%i== 0) {
                return false;
            }
        }

        return true;
    }
}
