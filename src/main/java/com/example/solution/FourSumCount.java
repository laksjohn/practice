package com.example.solution;

import java.util.HashMap;
import java.util.Map;

public class FourSumCount {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        int n = nums1.length;
        int result = 0;

        Map<Integer, Integer> tupleMap = new HashMap<>();

        for(int i:nums1){
            for(int j:nums2){
                int sum=nums1[i]+nums2[j];
                tupleMap.put(sum,tupleMap.getOrDefault(sum,0)+1);
            }
        }

        for(int i:nums3){
            for(int j:nums4){
                int sum=nums3[i]+nums4[j];
                if(tupleMap.containsKey(-sum)){
                    result+=tupleMap.get(-sum);
                }
            }
        }


        return result;
    }
}
