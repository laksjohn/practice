package com.example.solution;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxSubArray {

    public int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int currSum =0;

        for(int num:nums){
            currSum=+num;

        maxSum=Math.max(currSum,maxSum);
            if(currSum<0) currSum=0;
        }



        return maxSum;

    }
}
