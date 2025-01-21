package com.example.solution;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Reliability {

    public static void main(String args[]){

        System.out.println(getMaxStability(Arrays.asList(1,2,4),Arrays.asList(1,100,2)));

    }

    public static int getMaxStability(List<Integer> reliability, List<Integer> availability) {
        // Write your code here

        System.out.println("reliabilirty="+reliability);
        System.out.println("avail="+availability);

        int answer=0;


        long maxStability=-1;

        //stability=min(availability)*sum(reliability);

        for(int i=0;i<availability.size();i++){

            for(int j=0;j<availability.size();j++) {
                long sum=0;
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                int min=Integer.MAX_VALUE;
                for(int k=i;k<j;k++) {
                    sum = sum + reliability.get(k);
                    pq.add(availability.get(k));
                    min = Math.min(min, availability.get(k));
                    maxStability = Math.max(maxStability, sum * min);
                }
            }

        }

        answer=(int)(maxStability%1000000007);

        System.out.println("answer="+answer);
        System.out.println("max="+maxStability);

        return answer;
    }
}
