package com.example.blind;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutive {

    public int sequence(int[] nums) {

        HashSet<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));
        int answer=0;
        for(int n:numSet){
            if(!numSet.contains(n-1)){
                int length=1;
                while(numSet.contains(n+length)){
                    length++;
                }
                answer=Math.max(answer,length);
            }
        }

        return answer;
    }
}
