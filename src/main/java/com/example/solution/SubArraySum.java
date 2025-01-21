package com.example.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArraySum {

    public static void main(String args[]){

        List l1 = Arrays.asList(20,30,0,10);
        List l2 = Arrays.asList(1,3,10);
        List l3 = Arrays.asList();
        List l4= Arrays.asList(l2);
        System.out.println(findSum(l1,l4));
    }

    public static List<Long> findSum(List<Integer> numbers, List<List<Integer>> queries) {
        // Write your code here

        List<Long> ans = new ArrayList<>();

        List<Integer> sumList = new ArrayList<>();
        List<Integer> zeroList = new ArrayList<>();
        int sum=0;
        int count=0;
        for(int num:numbers){
            sum=sum+num;
            if(num==0) count++;
            sumList.add(sum);
            zeroList.add(count);

        }


        for(int i=0;i< queries.size();i++){
            List<Integer> li=queries.get(i);
            int start=li.get(0);
            int end=li.get(1);
            int value=li.get(2);
            long sumOfQuery=0;
            sumOfQuery= sumList.get(end-1)-sumList.get(start-1)
            +(zeroList.get(end-1)-zeroList.get(start-1))*value;

            ans.add(sumOfQuery);

        }





        return ans;
    }


}
