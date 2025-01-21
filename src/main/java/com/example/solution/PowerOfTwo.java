package com.example.solution;

import java.util.Arrays;
import java.util.List;

public class PowerOfTwo {

    public static void main(String args[]){

        List<Integer> arr = Arrays.asList(10,7,2,8,3);
        System.out.println(countPairs(arr));
    }


    public static long countPairs(List<Integer> arr) {

        // Write your code here

        long answer = 0;

        for (int i = 0; i < arr.size(); i++) {
            int j = i + 1;

            while (j < arr.size()) {
                int bit = arr.get(i) & arr.get(j);
                if (bit!=0 && isPowerOfTwo(bit)) {
                    answer = answer + 1;
                }
                j++;
            }
        }


        return answer;

    }

    private static boolean isPowerOfTwo(int bit) {

        double a = Math.log(bit) / Math.log(2);
        if(Math.ceil(a)==Math.floor(a)){
            return true;
        }
        
        return false;
    }

}