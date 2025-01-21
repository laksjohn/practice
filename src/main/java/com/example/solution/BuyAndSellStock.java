package com.example.solution;

public class BuyAndSellStock {

    public int maxProfit(int[] prices) {

        int maxProfit=0;
        int currProfit=0;
        int leastValue=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){

            if(prices[i]<leastValue){
                leastValue=prices[i];
            }
            currProfit = prices[i]-leastValue;
            maxProfit=Math.max(maxProfit,currProfit);
        }

        return maxProfit;

    }
}
