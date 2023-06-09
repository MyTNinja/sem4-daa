/*
Program to find the average of n (n < 10) numbers using arrays 
*/

import java.util.*;


class Average{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //taking size input with n<10 condition
        int n;    
        while(true){
            System.out.print("Input the number (N<10) of numbers to find average: ");
            n = sc.nextInt();
            if(n<10) break;
            System.out.println("Invalid Input: N>10");
        }
        
        //initialising array, sum, avg
        int arr[] = new int[n];
        int sum = 0;
        double avg;
        
        //input array
        System.out.println("Input " + n + " numbers");
        for(int i = 0; i<n; i++){
            System.out.print("-> ");
            arr[i] = sc.nextInt();
        }
        
        //adding into sum
        for(int i = 0; i<n; i++){
            sum = sum + arr[i];
        }
        
        //displaying average
        avg = sum/n;
        System.out.println("Average is: " + avg);
    }
}