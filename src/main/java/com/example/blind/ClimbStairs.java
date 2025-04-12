package com.example.blind;

import java.util.HashMap;
import java.util.Map;

public class ClimbStairs {

    public int climbStairs(int n) {
        Map<Integer, Integer> stepCount = new HashMap<>();

        return climbStairs(n,stepCount);
    }

    public int climbStairs(int n, Map<Integer,Integer> map){

        if(n==0||n==1){
            return 1;
        }

        if(!map.containsKey(n)) {

            map.put(n, climbStairs(n - 1, map) + climbStairs(n - 2, map));

        }
        return map.get(n);

    }

}
