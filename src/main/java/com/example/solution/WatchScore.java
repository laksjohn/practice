package com.example.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class WatchScore {

    public static void main (String args[]){

        findMinScore(Arrays.asList(1,2,2,2,5),1,5);

    }

    public static int findMinScore(List<Integer> watch_history, int series1, int series2) {
        // Write your code here
        System.out.println("watch history="+watch_history);
        System.out.println("series1="+series1);
        System.out.println("Series2="+series2);

        int answer=0;

        if(series1==series2 && watch_history.size()==1&&watch_history.contains(series1)){
            return 1;
        }
        if(!watch_history.contains(series1)&&!(watch_history.contains(series2))){
            return 0;
        }

        if(watch_history.size()==2&&watch_history.contains(series1)&&watch_history.contains(series2)){
            return 2;
        }

        int left=0;
        int minScore=Integer.MAX_VALUE;
        int pos1=-1;
        int pos2=-1;
        HashMap<Integer,Integer> distinctSeries = new HashMap<>();

        for(int right=0;right<watch_history.size();right++){
            Integer currentSeries=watch_history.get(right);
            distinctSeries.put(currentSeries,distinctSeries.getOrDefault(currentSeries,0)+1);
            if(currentSeries==series1) pos1=right;
            if(currentSeries==series2) pos2=right;

            if(pos1!=-1&&pos2!=-1){

                while(pos1>=left && pos2>=left){
                    int leftWindow=watch_history.get(left);

                    if(!distinctSeries.isEmpty()&&distinctSeries.get(leftWindow)==1){
                        distinctSeries.remove(leftWindow);
                    }else{
                        distinctSeries.put(leftWindow,distinctSeries.get(leftWindow)-1);
                    }
                    left++;
                }
            }
            minScore=Math.min(minScore,distinctSeries.size());
            distinctSeries.clear();



        }

       System.out.println("minScore="+minScore);
       if (minScore==Integer.MAX_VALUE){
           return 0;
       }else{
           return minScore;
       }



    }
}
