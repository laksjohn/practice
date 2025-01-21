package com.example.solution;

import java.util.Arrays;

public class ProductOFArrayExceptSelf {

    public static void main (String args[]){

        int[] nums = new int[]{0,8,0};

        Arrays.stream(nums).forEach(System.out::print);

        Arrays.stream(productExceptSelf(nums)).forEach(System.out::print);

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
//        int product= Arrays.stream(nums).filter(n->n!=0).reduce(1,(x,y)->x*y);
//        boolean isZeroPresent = Arrays.stream(nums).filter(n->n==0).count()>0?true:false;
//        int i=0;
//        for(int num:nums){
//            if(num!=0) {
//                answer[i] = product / num;
//            }else if(num==0){
//                answer[i]=product;
//            }
//        }

        int product=1;
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0]=nums[0]==0?1:1;
        long zeroPresent=Arrays.stream(nums).filter(n->n==0).count();


        for(int i=1;i< nums.length;i++){
            if(nums[i-1]!=0){
                product=product*nums[i-1];
                prefix[i]=product;
            }

        }

        Arrays.stream(prefix).forEach(System.out::print);


        suffix[nums.length-1]=nums[nums.length-1]==0?1:1;
        int sProduct=1;
        for(int i=nums.length-2 ;i>= 0;i--){
            if(nums[i+1]!=0){
                sProduct=sProduct*nums[i+1];
                suffix[i]=sProduct;
            }

        }
        Arrays.stream(suffix).forEach(System.out::print);


        if(zeroPresent>=2){

            Arrays.fill(answer,0);

        }

      else{

            for(int i=0;i<nums.length;i++){
                if((zeroPresent==1) && (nums[i]!=0)){
                    answer[i]=0;

                }else {
                    answer[i] = prefix[i] * suffix[i];
                }
            }
        }





        return answer;

    }

}
