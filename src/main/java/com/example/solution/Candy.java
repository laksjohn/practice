package com.example.solution;

import java.util.Arrays;

public class Candy {

    public static void main(String[] args){
        int[] input = {1,3,4,5,2};

        System.out.println(candy(input));
    }

        public static int candy(int[] ratings) {
            int ans = 0;
            int n=ratings.length;

            int[] candies = new int[n];
            Arrays.fill(candies,1);

            for(int i=1;i<ratings.length;i++){
                if(ratings[i]>ratings[i-1]){
                    candies[i]=candies[i-1]+1;
                }
            }

            for(int i=ratings.length-2;i>=0;i--){
                if(ratings[i]>ratings[i+1]){
                    candies[i]=Math.max(candies[i+1]+1,candies[i]);
                }
            }
            ans= Arrays.stream(candies).sum();

            return ans;
    }
}
