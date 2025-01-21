package com.example.solution;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String args[]){

        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
    public static int removeDuplicates(int[] nums) {

        Arrays.sort(nums);

        int length=0;
        int originalLength=nums.length;

        for(int i=1;i<nums.length;i++){

            if(nums[i]!=nums[i-1]){
                nums[length]=nums[i-1];
                length++;
            }

        }
        nums[length+1]=nums[originalLength];

        System.out.println(nums);


        return length+1;

    }


}
