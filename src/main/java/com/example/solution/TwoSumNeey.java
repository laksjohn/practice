package com.example.solution;

import java.util.HashMap;
import java.util.Map;

public class TwoSumNeey {

    public static void main (String [] args){
        int[] nums = new int[]{1,2,3,4};

        twoSum(nums,3);

    }


    public static  int[] twoSum(int[] numbers, int target) {

        Map<Integer,Integer> targetIndexMap = new HashMap<>();
        int[] answer = new int[2];
        for(int i=0;i<numbers.length;i++){
            if(targetIndexMap.containsKey(numbers[i])) {
                answer[0] = targetIndexMap.get(numbers[i]);
                        answer[1] = i;
            }else{
                targetIndexMap.put(target-numbers[i],i);
            }
        }

        return answer;


    }
}


