package com.example.solution;

import java.util.Collections;
import java.util.PriorityQueue;

public class RefuellingStopsSecond {

    public static void main(String args[]){



        //Input: target = 1, startFuel = 1, stations = []


       // Input: target = 100, startFuel = 1, stations = [[10,100]]

        System.out.println("Expected Result :-1 Actual Result ="+minRefuelStops(100,1,new int[][]{{10,100}}));




    }

    public static int minRefuelStops(int target, int startFuel, int[][] stations) {


        //start fuel >> 10
        //target
        //{{miles,gas}} {{10,2} {200}
        //
//        int fuel=startFuel;
//        int stops=0;
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//
//        for(int[] station:stations){
//            int miles= station[0];
//            int fuelAvailable = station[1];
//
//            while(fuel<miles){
//                //if pq.is empty -- return -1;
//                stops++;
//                fuel=+pq.poll();
//
//            }
//            pq.add(fuelAvailable);
//
//        }
//
//        while(fuel<target){
//            stops++;
//        }







        //if start fuel is less than the pos[0] then the car can never reach the target
        //if sum of fuel + start fuel is less than target then cant reach target
        // if start fuel > target then 0 refuelling stops

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        int tank=startFuel;
        int stops=0;
        for(int[] station:stations){


            int distance=station[0];
            int fuel=station[1];
            while(tank<distance){
                //if pq is empty then return -1;
                tank=tank+pq.poll();
                stops++;
            }
            pq.add(fuel);
        }

        while(tank<target){
            //if pq is empty then return -1
            tank=tank+pq.poll();
            stops++;
        }


        return stops;



    }

    }
