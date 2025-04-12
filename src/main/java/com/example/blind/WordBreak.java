package com.example.blind;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class WordBreak {

//    public boolean wordBreak(String s, List<String> wordDict) {
//
////
////        for(String word:wordDict){
////            int wordLength=word.length();
////
////            if(s.length()>=wordLength){
////                if(s.startsWith(word)){
////                    boolean isWordBreak=wordBreak(s.substring(wordLength),wordDict);
////                    if(isWordBreak) return isWordBreak;
////                }
////            }
////
////        }
////
////
////        return false;
//
//
//    }

    public static void main(String[] args){

        System.out.println(wordBreak("catsandog", Arrays.asList("cats","and","dog")));
        System.out.println(wordBreak("cars",Arrays.asList("car","ca","rs")));

    }

    public static boolean wordBreak(String s, List<String> wordDict) {

        HashMap<String, Boolean> map = new HashMap<>();
        return canConstruct(s, wordDict, map);

    }

    public static boolean canConstruct(String target, List<String> words, HashMap<String, Boolean> map) {

        if (map.containsKey(target)) {
            return map.get(target);
        }

        if (target.isEmpty()) {
            return true;
        }

        for (String word : words) {

            if (target.startsWith(word)) {
                if (canConstruct(target.substring(word.length()), words, map)) {
                    map.put(target, true);
                    return true;
                }
            }


        }

        map.put(target, false);
        return false;

    }
}
