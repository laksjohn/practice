package com.example.blind;

public class MaxProductSubArray {

    public int maxProduct(int[] nums) {

        int currProduct=1;
        int maxProduct=1;
        for(int left=0;left<nums.length;left++) {
            for (int right = left; right < nums.length; right++) {

                int tempProduct = nums[left] * nums[right] * currProduct;
                if (tempProduct < currProduct) {

                }
            }
        }

        return 0;
    }
}
