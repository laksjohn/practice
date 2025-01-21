package com.example.solution;

public class KokoBanana {

    public static void main(String args[]) {

        System.out.println("Min Speed is " + minEatingSpeedBinary(new int[]{1000000000,1000000000},
        3));
    }

    public static int minEatingSpeed(int[] piles, int h) {

        long sum = 0;
        for (int i = 0; i < piles.length; i++) {

            sum = sum + piles[i];
        }

        int minSpeed = (int) (sum / h);

        int temp = 0;
        while (true) {
            for (int i = 0; i < piles.length; i++) {
                temp = temp + (int) Math.ceil((double) piles[i] / minSpeed);
            }
            if (temp <= h) break;

            minSpeed++;
            temp = 0;
        }


        return minSpeed;

    }

    public static int minEatingSpeedBinary(int[] piles, int h) {


        long sum = 0;
        for (int i = 0; i < piles.length; i++) {

            sum = sum + piles[i];
        }

        int maxSpeed=0;
        int minSpeed = (int) (sum / h);


        for (int i = 0; i < piles.length; i++) {

           maxSpeed = Math.max(maxSpeed,piles[i]) ;
        }

        int low = minSpeed, high = maxSpeed, k = 0;
        while (low <= high) {
            k = (low + high) / 2;
            int temp = 0;
            for (int i = 0; i < piles.length; i ++)
                temp += Math.ceil(1.0 * piles[i] / k);
            if (temp > h)
                low = k + 1;
            else
                high = k - 1;
        }
        return low;
    }
}


