package com.example.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compartments {

    public static void main (String[] args){

        String s="*|**|**|";
        List<Integer> start = Arrays.asList(1);
        List<Integer> end = Arrays.asList(6);

        System.out.println(countItems(s,start,end));

    }

    public static List<Integer> countItems(String s, List<Integer> startIndices, List<Integer> endIndices){

        List<Integer> result = new ArrayList<>();

        for(int i=0;i<startIndices.size();i++){
            int start=startIndices.get(i)-1;
            int end=endIndices.get(i)-1;
            int finalCount=0;
            int tempCount=0;
            boolean started=false;

            while(start<end){
                if(s.charAt(start)=='|'){
                    started=true;
                    if(tempCount>0){
                        finalCount=finalCount+tempCount;
                        tempCount=0;
                    }
                }
                if(started&&s.charAt(start)=='*'){
                    tempCount++;
                }
                start++;
            }

            result.add(finalCount);

        }

        return result;
    }
}
