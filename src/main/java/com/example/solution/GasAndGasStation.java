package com.example.solution;

import java.util.Arrays;

public class GasAndGasStation {

    public int canCompleteALoop(int[] gasStation, int[]costs){



        //Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]

        //4-1=3
        //3+5-2=6
        //6+1-3=4
        //4+2-4=2
        //2+3-5=0

        int tank=0;
        int start=0;
        int totalExtra=0;

        for(int i=0;i< gasStation.length;i++){
            totalExtra=+gasStation[i]-costs[i];
            tank=tank+gasStation[i]-costs[i];
            if(tank<0){
                tank=0;
                start=i+1;
            }
        }

        return start;



//        if(Arrays.stream(gasStation).sum()<Arrays.stream(costs).sum()) return -1;
//
//        int tank=0;
//        int startPosition=0;
//        int i=0;
//        for(int gas: gasStation){
//
//             tank=tank+costs[i]-gas;
//            if(tank<0){
//                startPosition=i+1;
//                tank=0;
//            }
//
//        }
//
//        return startPosition;








    }
}
