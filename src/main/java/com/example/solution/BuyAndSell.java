package com.example.solution;

public class BuyAndSell {

    public static void main (String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Expected Result: 5  Actual Result: " +maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int maxProfit =0;
        int profit=0;
        int leastPrice = Integer.MAX_VALUE;

        for(int price:prices){

            if(price<leastPrice){
                leastPrice=price;
            }


            profit=price-leastPrice;

            if(profit>maxProfit){
                maxProfit=profit;
            }


        }

        return maxProfit;
    }
}
