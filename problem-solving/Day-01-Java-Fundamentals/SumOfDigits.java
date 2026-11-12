/*
 * Q1. Sum of Digits – Easy
 *
 * Problem:
 * Read an integer N and print the sum of its digits.
 * Treat a negative number using its absolute value.
 *
 * Input:
 * N
 *
 * Expected Output:
 * Sum of digits
 *
 * Test Cases:
 * Input: 4821
 * Output: 15
 *
 * Input: -709
 * Output: 16
 */

import java.util.*;
class SumOfDigits{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int consumed=sc.nextInt();
    if(consumed<0)
        consumed=Math.abs(consumed);
    int result=0;
    while(consumed>0){
        int digit=consumed%10;
        result+=digit;
        consumed/=10;
    }
    System.out.println("Consumed :"+result);
   } 

}

