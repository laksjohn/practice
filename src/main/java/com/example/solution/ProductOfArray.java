package com.example.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProductOfArray {

    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];

        Arrays.fill(answer,1);

        int length=nums.length;
        int[] preFix = new int[length];
        preFix[0]=1;
        int[] suffix = new int[length];
        suffix[length-1]=1;

        for(int i=1;i<length;i++){
            preFix[i]=preFix[i-1]*nums[i-1];

        }


        for(int i=length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];

        }

        for(int i=0;i<=length;i++){
            answer[i]=preFix[i]*suffix[i];
        }

        return answer;






    }
}
