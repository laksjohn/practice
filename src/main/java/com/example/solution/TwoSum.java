package com.example.solution;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> myMap = new HashMap<>();
        int[] answer = new int[2];

        int i = 0;
        for (int num : nums) {
            myMap.put(target - num, i);
            i++;
        }

        int j = 0;
        for (int num : nums) {

            if (myMap.containsKey(num) && (myMap.get(num)!=j)) {
                answer[0] = myMap.get(num);
                answer[1] = j;

            }
            j++;
        }


        return answer;
    }


}
