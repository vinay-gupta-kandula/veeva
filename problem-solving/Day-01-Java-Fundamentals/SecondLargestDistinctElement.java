/*Q4. Second Largest Distinct Element – Moderate 
Problem: Given N integers, print the second-largest distinct value. If fewer than two distinct values 
exist, print None. Do not sort the array. 
Input: N followed by N integers 
Expected Output: Second-largest distinct value, or None 
Test Cases: 
Input: 6 
4 9 2 9 7 7 
Output: 7 
Input: 4 
5 5 5 5 
Output: None */


import java.util.*;
class SecondLargestDistinctElement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<2){
            System.out.println("None");
            return;
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
        if(arr[i]>largest){
           secondlargest=largest;
           largest=arr[i];
        }
        else if(arr[i]>secondlargest && arr[i]<largest){
            secondlargest=arr[i];
        }
     }
     if(secondlargest==Integer.MIN_VALUE){
        System.out.println("None");
     }
     else{
        System.out.println(secondlargest);
     }
    }
}