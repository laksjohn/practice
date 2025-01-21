package com.example.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramsInAString {
  public static void main(String args[]){

       int[][] twoDArray= {{25,27},{36,187},{140,186},{378,6},{492,202},{517,89},{579,234},{673,86},{808,53},{954,49}};

       RefuellingStops refuellingStops = new RefuellingStops();
       System.out.println(refuellingStops.minRefuelStops(1000,83,twoDArray));

//      CustomHashMap myHashmap = new CustomHashMap<>();
//      myHashmap.put(1,"a");
//      myHashmap.put(2,"a");
//
//      System.out.println(myHashmap.size());

//      System.out.println(findAnagrams("abcbca","abc"));
  }
    public  static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if(s.equals(p)){
            result.add(0);
            return result;
        }
        char[] pArray = p.toCharArray();
        Arrays.sort(pArray);

        for (int i = 0; i <= s.length() - p.length(); i++) {
            String subString = s.substring(i, i + p.length());
            char[] sArray = subString.toCharArray();
            Arrays.sort(sArray);
            if (Arrays.equals(sArray,pArray)) {
                result.add(i);

            }

        }


        return result;

    }
}
