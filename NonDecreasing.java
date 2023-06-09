/*
Design and implement an algorithm that inputs three integers and outputs them in non-decreasing order. 
Write a program and find the time and space complexity. 
*/

import java.util.*;


class NonDecreasing{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[3];
        
        //input
        System.out.println("Input 3 numbers: ");
        for(int i = 0; i<3; i++){
            System.out.print("->");
            arr[i] = sc.nextInt();
        }
        
        //insertion sort
        int key, j;
        for(int i = 1; i<3; i++){
            key = arr[i];
            j = i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        
        //display non-decreasing order
        System.out.println("The non-decreasing order is: ");
        for(int i = 0; i<3; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
