package com.example.solution;

import java.util.List;
import java.util.PriorityQueue;

public class Parallelize {

    public static void main(String args[]){

    }

    public static long minTime(List<Integer> files, int numCores, int limit) {
        // Write your code here

        long time=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(Integer file:files){

            if(file%numCores==0 && limit>1){
                time=time+file/numCores;
                pq.add(file/numCores);
            }else{
                time=time+ file;
                pq.add(file);

            }
        }

        int temp=0;
        if(limit>1){

            while(!pq.isEmpty() && temp<=limit){
                time=time-pq.poll();
                temp++;
            }

        }

        return time;

    }

}
