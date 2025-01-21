package com.example.solution;

public class MaxProductSubArray {

    public int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int currSum =1;

        for(int num:nums){
            currSum=currSum*num;

        maxSum=Math.max(currSum,maxSum);
            if(currSum<=0) currSum=1;
        }



        return maxSum;

    }
}
