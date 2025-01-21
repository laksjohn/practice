package com.example.solution;

import java.util.*;

public class RefuellingStops {

    //edge cases

    /*
    start fuel + Total fuel < Target : -1
    start fuel < distance to the first station : -1
    start fuel > target : 0
    start fuel > target && there are no stations : 0
    start fuel < target && there are no stations : 0
     Use Pq to hold the possible fuelling amounts.
     When the fuelbought<distance then poll to refuel the biggest volume from the ones that we are already passed
     Its possible that subsequent pitstops may have more gas but we may not have enough gas to reach those

     */

    public int minRefuelStops(int target, int startFuel, int[][] stations) {

        if(startFuel>=target){
            return 0;
        }

        if(stations.length==0){
            return -1;
        }
        if(startFuel<stations[0][0])
            return -1;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        int fuelBought=startFuel;
        int numberofRefuels=0;


        for(int[]station:stations){

            while(fuelBought<station[0]){
                if(priorityQueue.isEmpty()) return -1;
                fuelBought=fuelBought+priorityQueue.poll();
                numberofRefuels++;
            }
            priorityQueue.add(station[1]);

        }

        while(fuelBought<target) {
            if(priorityQueue.isEmpty()) return -1;
            fuelBought=fuelBought+priorityQueue.poll();
            numberofRefuels++;
        }


        if(target>fuelBought)
            return -1;



        return numberofRefuels;








    }

    /*
     * Intution
     */

    /**
     * Approach
     */

    /**
     * Complexity
     */

    /**
     * Code
     */
}
