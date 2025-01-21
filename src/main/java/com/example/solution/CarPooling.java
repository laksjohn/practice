package com.example.solution;

import java.util.Arrays;
import java.util.PriorityQueue;

public class CarPooling {

    public static void main(String[] args){

        int[][] trips= {{2,1,5},{3,3,7}};
        int capacity=4;
        System.out.println("can be car pooled?"+ isCarPoolingPossible(trips,capacity));
    }


    public static  boolean isCarPoolingPossible(int[][] trips, int capacity) {

//        int lengthOfTrip[]=new int[1001];
//
//        for(int[] trip:trips){
//            lengthOfTrip[trip[1]]=+trip[0];
//            lengthOfTrip[trip[2]]=-trip[0];
//
//
//        }
//
//        int carLoad=0;
//        for(int i=0;i<1001;i++){
//            carLoad+=lengthOfTrip[i];
//            if(carLoad<capacity) return false;
//        }

        Arrays.sort(trips,(a, b)->Integer.compare(a[1],b[1]));

        PriorityQueue<int[]> minExitPq =
                new PriorityQueue<>(trips.length, (a,b) -> Integer.compare(a[2], b[2]));


        int seatsOccupied=0;

        for(int[] trip:trips){

            while(!minExitPq.isEmpty()&&minExitPq.peek()[2]<trip[1]){
                seatsOccupied=-minExitPq.peek()[0];

            }
            seatsOccupied=+trip[0];
            if(seatsOccupied>capacity) return false;

            minExitPq.add(trip);

        }









//
//        int seatsOccupied = 0;
//        for (int[] trip : trips) {
//            // remove the completed trips
//            while (!minHeap.isEmpty() && minHeap.peek()[2] <= trip[1]) {
//                seatsOccupied -= minHeap.poll()[0];
//            }
//            seatsOccupied += trip[0];
//            if (seatsOccupied > capacity) {
//                return false;
//            }
//            minHeap.offer(trip);
//        }




        return true;

    }
}
