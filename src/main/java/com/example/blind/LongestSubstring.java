package com.example.blind;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {

        int left=0;
        int maxLength=0;

        Set<Character> set = new HashSet<>();

        for(int right=0;right<s.length();right++){

            if(set.contains(s.charAt(right))){
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
                set.add(s.charAt(right));

            }else{
                set.add(s.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);

            }

        }

        return maxLength;
    }
}
