package com.example.solution;

import java.util.Arrays;

public class Permutation {

    public static void main (String[] args){
        String s1="ab";
        String s2="eidbaooo";

        checkInclusion(s1,s2);

    }

    public static boolean checkInclusion(String s1, String s2) {

        if(s2.contains(s1))
        {
            return true;
        }

        if(s2.length()<s1.length()){
            return false;
        }
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);

        for(int i=0;i<s2.length()-s1.length();i++){

         char[] sub = s2.substring(i,i+s1.length()).toCharArray();
         Arrays.sort(sub);
         if(Arrays.equals(sub,c1)){
             return true;
         }
        }


        return false;

    }
}
