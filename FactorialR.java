/*
The factorial n! has value 1 when n<=1 and value n*(n-1)! When n>1. 
Write recursive algorithm to compute n!. 
Write a program and find the time and space complexity. 
*/

import java.util.*;


class FactorialR{
    //recursive function to find factorial
    public static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //input number with conditon N>=0
        int num;    
        while(true){
            System.out.print("Input number (N>=0): ");
            num = sc.nextInt();
            if(num>=0) break;
            System.out.println("Invalid Input: N<0");
        }
        
        //diplaying factorial by calling function
        System.out.println("Factorial of " + num + " is " + fact(num));
    }
}