package com.example.solution;

import java.util.HashMap;
import java.util.HashSet;

public class CharacterReplacement {

    public static void main(String args[]){
        String s = "XYYX";
        int k=2;
        characterReplacement(s,k);

    }

    public static int characterReplacement(String s, int k) {

        int result =0;
        if (s.length()==1) return 1;

//        for(int i=0;i<s.length();i++){
//            HashMap<Character,Integer> charCountMap = new HashMap<>();
//            int max=0;
//            for(int j=i;j<s.length();j++){
//                charCountMap.put(s.charAt(i),charCountMap.getOrDefault(s.charAt(i),0)+1);
//                max=Math.max(max,charCountMap.get(s.charAt(j)));
//                if((j-i+1)-max<=k){
//                    result=Math.max(result,j-i+1);
//                }
//            }
//        }

        HashSet<Character> charSet = new HashSet<>();

        for(char c:s.toCharArray()){
            charSet.add(c);
        }
        for(char c:charSet){
            int count=0;
            int left=0;
            for(int right=0;right<s.length();right++){
                if(s.charAt(right)==c){
                    count++;
                }
              //  while((right-left+1)-count>k)
            }
        }



        return result;

    }

}
