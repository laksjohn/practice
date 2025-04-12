package com.example.blind;

import java.util.Collections;
import java.util.PriorityQueue;

public class RefuelingStopsMinimum {

    public int minRefuelStops(int target, int startFuel, int[][] stations) {

        if(startFuel<stations[0][0])
            return -1;

        if(startFuel>target)
            return 0;

        if(stations.length==0){
            return -1;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int tank=startFuel;
        int distance=0;
        int stops=0;

        for(int[] station:stations){
            while(tank<station[0]){
                if(pq.isEmpty())
                    return -1;
                tank=tank+pq.poll();
                stops++;
            }
            pq.add(station[1]);
        }

        while(tank<target){
            if(pq.isEmpty())
                return -1;
            tank=tank+pq.poll();
            stops++;

        }

        return stops;
    }

    }
