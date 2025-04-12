package com.example.blind;

import java.util.Collections;
import java.util.PriorityQueue;

public class GasStation {

    public int canCompleteCircuit(int[] gasStation, int[] costs) {
            int tank=0;
            int startPos=-1;
            int i=0;

            for(int gas:gasStation){
                tank=tank+gas-costs[i];
                if(tank<0){
                    startPos=i+1;
                    tank=0;
                }
                i++;

        }

            return startPos;
    }

    }
