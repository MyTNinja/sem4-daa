/*
Given n Boolean variables x1, x2, x3, .... xn  we wish to print all possible combinations of truth values they can assume. 
For instance, if n=2, there are 4 possibilities: true, true; true, false; false, true and false, false. 
Write a program and find the time and space complexity.  
*/

import java.util.*;


class TruthValuesV{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //input number of variables
        System.out.print("Enter number of variables: ");
        int n = sc.nextInt();
        
        //displaying combinations
        String  zero="";
        for (int i = 0; i < Math.pow(2,n); i++){
            //converting combination number to binary
            String bin = Integer.toBinaryString(i);
            if(bin.length()<n){
                //padding with zero
                for(int j=0;j<(n-bin.length());j++){
                    zero+="0";
                }
            }
            //final padded binary string
            String combined = zero+bin;
            String final_bin="";
            //changing 1 to true and 0 to false in binary string
            for(int k=0;k<combined.length();k++){
                if(combined.charAt(k) == '1'){
                    final_bin+="True\t";
                }
                else {
                    final_bin+="False\t";
                }
            }
            System.out.println(final_bin);
            zero = "";
        }
    }
}
