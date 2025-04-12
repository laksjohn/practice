package com.example.solution;

public class BestTimetoBuyAndSell {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currProfit = 0;
        int leastValue = Integer.MAX_VALUE;


        for (int price:prices) {

            if (price < leastValue) {
                leastValue = price;
            }

            currProfit = price - leastValue;

            if (currProfit > maxProfit) {
                maxProfit = currProfit;
            }

        }

        return maxProfit;


    }
}
