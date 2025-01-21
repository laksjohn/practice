package com.example.solution;

import java.util.Arrays;

public class GasStationSecond {

    public int canCompleteCircuit(int[] gasStation, int[] costs) {

        //Boundary - Total gas > Total costs

       if(Arrays.stream(gasStation).sum()<Arrays.stream(costs).sum()) return -1;

       int start=-1;
       int totalGas =0;
       int totalCost=0;
       int diff=0;

       int i=0;
       for(int gas:gasStation){
           totalCost=+costs[i];
           totalGas=+gas;
           diff=totalCost-totalGas;
           if(diff<0){
               start=i;
               totalGas=0;
           }

       }
        return start;

    }

    }
