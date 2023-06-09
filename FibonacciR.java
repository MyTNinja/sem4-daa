/*
The Fibonacci numbers are defined as f0 = 0, f1 = 1 and fi = fi-1  + fi-2  for i>1.  
*/

import java.util.*;

class FibonacciR {
    //recursive function to display fibonacci sequence
    public static int fib(int n){
        if(n<=1) return(n);
        return fib(n-1) + fib(n-2);
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
        for(int i = 0; i<num; i++){
            System.out.print(fib(i) + " ");
        }
    }
}