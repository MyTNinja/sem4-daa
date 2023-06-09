/*
The Fibonacci numbers are defined as f0 = 0, f1 = 1 and fi = fi-1  + fi-2  for i>1.  
*/

import java.util.*;

class FibonacciI{
    //iterative function to display fibonacci sequence
    public static void fib(int n){
        int a, b, c;
        a = 0;
        b = 1;
        
        //displaying first two terms
        System.out.print(a + " " + b + " ");
        
        for(int i = 2; i<n; i++){
            c = a + b;
            System.out.print(c + " ");
               
            a = b;
            b = c;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //input number with conditon N>=1
        int num;    
        while(true){
            System.out.print("Input number of terms (N>=1): ");
            num = sc.nextInt();
            if(num>=1) break;
            System.out.println("Invalid Input: N<1");
        }
        
        //displaying fibonacci sequence by calling function
        fib(num);
    }
}