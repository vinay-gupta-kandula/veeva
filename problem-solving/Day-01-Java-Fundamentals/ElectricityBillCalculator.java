/*Calculate a domestic electricity bill using slabs: first 100 units at ₹1.5/unit, next 100 at 
₹2.5/unit, and units above 200 at ₹4/unit. Add a fixed charge of ₹50. Units are non-negative; print the 
bill with two decimal places.  */

import java.util.*;
class ElectricityBillCalculator {
    public static void main(String args[]) {    
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double billAmount = 0.0;

        if (units <= 100) {
            billAmount = units * 1.5;
        } else if (units <= 200) {
            billAmount = (100 * 1.5) + ((units - 100) * 2.5);
        } else {
            billAmount = (100 * 1.5) + (100 * 2.5) + ((units - 200) * 4);
        }

        billAmount += 50; // Adding fixed charge
        System.out.printf("Total Bill: %.2f\n", billAmount);
        sc.close();
    }
}