package com.example.solution;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> mySet = new HashSet<>();

        for(int num:nums){
            if(mySet.contains(num)) return true;
            mySet.add(num);
        }

        return false;

    }
}
