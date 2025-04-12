package com.example.blind;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int leastPrice =prices[0];
        int currProfit=0;

        for(int price:prices){
            leastPrice=Math.min(leastPrice,price);
            currProfit=price-leastPrice;
            maxProfit=Math.max(currProfit,maxProfit);
        }

        return maxProfit;

    }
    }
