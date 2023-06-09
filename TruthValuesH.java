/*
Given n Boolean variables x1, x2, x3, .... xn  we wish to print all possible combinations of truth values they can assume. 
For instance, if n=2, there are 4 possibilities: true, true; true, false; false, true and false, false. 
Write a program and find the time and space complexity.  
*/

import java.util.*;


class TruthValuesH{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //input number of variables
        System.out.print("Enter number of variables: ");
        int n = sc.nextInt();
        //defining number of combinations
        double c = Math.pow(2,n);
        
        //displaying combinations
        System.out.println("Combinations: ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<c; j++){
                double step = Math.floor(j/Math.pow(2,i));
                if(step%2==0) System.out.print("False\t");
                else System.out.print("True\t");
            }
            System.out.println();
        }
    }
}