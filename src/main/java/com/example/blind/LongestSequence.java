package com.example.blind;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class LongestSequence {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);

        HashSet<Integer> set;

        int diff=0;

        for(int i=0;i<nums.length;i++){

        }
        int i=0;

        while(diff==1){

            diff=nums[i+1]-nums[i];
            i++;

        }

        return i;
    }
}
