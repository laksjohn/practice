package com.example.solution;

public class NeetBuy {
    public int maxProfit(int[] prices) {
        int profit =0;
        int currProfit=0;
        int sell=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){

           if(prices[i]<sell){
               Math.min(prices[i],sell);

           }
            currProfit=prices[i]-sell;
            profit=Math.max(currProfit,profit);


        }




        return profit;
    }
}
