package com.example.solution;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequentElement {

    public static void main (String[] args){

        int[] x= new int[]{1,2,2,3};
        Arrays.stream(topKFrequent(x, 1)).forEach(System.out::println);

    }

    public static int[] topKFrequent(int[] nums, int k) {

        int[] answer = new int[k];

        if(nums.length==1 && k==1){
            return nums;
        }

        if(nums.length<k)
            return new int[0];

        Arrays.sort(nums);

        Map<Integer,Integer> map1 = new HashMap<>();

        for(int num:nums){

           map1.put(num,map1.getOrDefault(num,0)+1);

        }

        PriorityQueue<int[]>  pq=new PriorityQueue<>((a,b)->b[0]-a[0]);

        for(Map.Entry<Integer,Integer> entry:map1.entrySet()){
            pq.add(new int[] {entry.getValue(), entry.getKey()});
        }

        for(int i=0;i<k;i++){
            answer[0]=pq.poll()[1];
        }

        return answer;
    }
}
