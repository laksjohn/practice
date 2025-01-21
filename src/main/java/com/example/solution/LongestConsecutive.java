package com.example.solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class LongestConsecutive {

    public static void main (String args[]){
        int[] nums = new int[]{9,1,4,7,3,-1,0,5,8,-1,6};

        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        //Zero length array
        //Single length array
        //pq is empty
        //negative numbers
        //zeros
        //multiple sequences are present

        if(nums.length==0) return 0;
        int[] nums1= Arrays.stream(nums).distinct().sorted().toArray();

        int length=1;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=1;i<nums1.length;i++){
            if(nums1[i]-nums1[i-1]==1) {
                length++;
                pq.add(length);

            }else{
                length=1;

            }


        }

        if(!pq.isEmpty())
        return pq.poll();
        else return 1;

    }
}
