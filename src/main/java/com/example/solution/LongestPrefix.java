package com.example.solution;

import java.util.Arrays;
import java.util.Comparator;

public class LongestPrefix {

    public String longestCommonPrefix(String[] strs) {

        //if str is empty return "";
        //if strs size is 1 then return strs[0];
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        Arrays.sort(strs, (str1, str2) -> Integer.compare(str1.length(), str2.length()));
        Arrays.stream(strs).sorted((str1, str2) -> Integer.compare(str1.length(), str2.length())).toArray(String[]::new);

        for (int i = 0; i < strs.length; i++) {

        }


        return "";
    }

}
