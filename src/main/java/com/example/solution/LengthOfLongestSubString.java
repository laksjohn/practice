package com.example.solution;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubString {

    public static void main(String args[]){
        System.out.println(lengthOfLongestSubstring("abcabc"));
    }

    public static int lengthOfLongestSubstring(String s) {

        char[] chars = s.toCharArray();
        Set<Character> characterSet = new HashSet<>();
        int length = 0;
        int left = 0;


        for (int right = 0; right < chars.length; right++) {
            while (characterSet.contains(chars[right])) {
                characterSet.remove(chars[left]);
                left++;
            }
            characterSet.add(chars[right]);
            length = Math.max(length, right - left + 1);
        }


        return length;
    }

}
