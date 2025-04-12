package com.example.blind;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        Arrays.stream(nums).forEach(i->map.put(target-i,i));

        int[] result = new int[2];

        for(Integer n:nums){
            if(map.containsKey(n)){
                result[0]= IntStream.range(0,nums.length).filter(i->nums[i]==n).findFirst().orElse(-1);
                result[1]=target-n;
            }
        }

        return result;



    }
}
