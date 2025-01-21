package com.example.solution;

public class MaxXORArray {

    public int findMaximumXOR(int[] nums) {

        int result = 0;
        int curr = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {

                curr = nums[i] ^ nums[j];

                if (curr > result) result = curr;
            }
        }


        return result;

    }
}
