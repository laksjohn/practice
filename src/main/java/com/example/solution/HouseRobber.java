package com.example.solution;

public class HouseRobber {
    public int rob(int[] nums) {

        int i=0;
        boolean odd=true;
        int oddSum=0;
        int evenSum=0;
        for(int num:nums){
            if(odd){
                oddSum=+num;
                odd=false;
            }else{
                odd=true;
                evenSum=+num;
            }


        }

        return Math.max(oddSum,evenSum);

    }
}
