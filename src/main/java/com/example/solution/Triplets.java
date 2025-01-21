package com.example.solution;

import java.util.*;

public class Triplets {


    public static void main (String[] args){
        int[] nums={-1,0,1,2,-1,-4};
        threeSum(nums);

    }
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> answer = new ArrayList<>();
        if(nums.length<3){
            return answer;
        }



        Arrays.sort(nums);
        List<Integer> negList = new ArrayList<>();
        List<Integer> positiveList = new ArrayList<>();


        for(int i=0;i<nums.length;i++){

            if(nums[i]<=0){
                negList.add(nums[i]);

            }
            if(nums[i]>=0){
                positiveList.add(nums[i]);
            }


        }
        Map<Integer,List> nsum = new HashMap<>();
        Map<Integer,List> psum = new HashMap<>();



        for(int i=0;i<negList.size();i++){
            for(int j=1;j<negList.size();j++){
                if(i!=j) {
                    List<Integer> list = new ArrayList();
                    list.add(negList.get(i));
                    list.add(negList.get(j));

                    nsum.put(-1 * (negList.get(i) + negList.get(j)), list);
                }
        }
        }

        for(int i=0;i<positiveList.size();i++){
            for(int j=1;j<positiveList.size();j++){
                if(i!=j) {
                    List<Integer> list = new ArrayList();
                    list.add(positiveList.get(i));
                    list.add(positiveList.get(j));

                    psum.put(-1 * (positiveList.get(i) + positiveList.get(j)), list);
                }
            }
        }

        for(Integer n:negList) {
            if (psum.containsKey(n)) {
                List list = psum.get(n);
                list.add(n);
                answer.add(list);
            }
        }

        for(Integer p:positiveList) {
            if (nsum.containsKey(p)) {
                List list = nsum.get(p);
                list.add(p);
                answer.add(list);
            }
        }







        return answer;

    }

}
