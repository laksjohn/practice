package com.example.solution;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String args[]){

        System.out.println(bSearch(new int[]{1, 2, 3, 4},10));
    }

    public static int search(int[] nums, int target) {


        int index = Arrays.binarySearch(nums,target);

        System.out.println(index);

        return index;
    }

    public static int bSearch(int[] nums,int target){

        return recursiveSearch(0,nums.length-1,nums,target);

    }

    private static int recursiveSearch(int l, int r, int[] nums, int target) {

        if(l>r) return -1;
        int middle =l+(r-1)/2;

        if(nums[middle]==target) return middle;
        return(nums[middle]<target)?
                recursiveSearch(middle+1,r,nums,target):
                recursiveSearch(l,middle-1,nums,target);
    }
}
