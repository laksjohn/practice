package com.example.interview;

public class Stocks {


    public static void main(String args[]) {

        int[] stockPrices = new int[]{23, 13, 25, 29, 33, 19, 34, 69, 14, 45, 65, 67, 34, 33, 20, 50, 70, 13, 18, 10, 5};

        int profit = 0;
        int minBuyPrice = Integer.MAX_VALUE;
        int maxSellPrice = Integer.MIN_VALUE;
        int currProfit;
        int buyDayIndex=0;
        int sellDayIndex=0;
        int sellingPrice=0;



            int buy=0;
            int sell=0;
            int length=stockPrices.length;
            while(buy<length&& sell<length) {
                while (buy<length && stockPrices[buy] < minBuyPrice) {
                    minBuyPrice = stockPrices[buy];
                    //buy here
                    buyDayIndex = buy;
                    buy++;
                }
                sell = buyDayIndex + 1;
                while (sell<length&& stockPrices[sell] > minBuyPrice && stockPrices[sell] > sellingPrice) {

                    sellDayIndex = sell;
                    sellingPrice = stockPrices[sell];
                    sell++;

                }
                System.out.println("buyPrice="+minBuyPrice +"  sellingPrice"+sellingPrice);
                buy=sell;
                minBuyPrice=Integer.MAX_VALUE;
                sellingPrice=Integer.MIN_VALUE;
            }

            }


        }




