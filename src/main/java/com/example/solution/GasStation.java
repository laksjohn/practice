package com.example.solution;

public class GasStation {


    public int canCompleteCircuit(int[] gas, int[] cost) {

        int curr = 0;
        int total = 0;
        int start = 0;
        int diff = 0;

        for (int i = 0; i < gas.length; i++) {
            diff = gas[i] - cost[i];
            total = total + diff;
            curr = curr + diff;

            if (curr < 0) {
                start = i + 1;
                curr = 0;
            }


        }

        if (total >= 0) return start;
        return -1;


    }
}
