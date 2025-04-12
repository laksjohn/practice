package com.example.blind;

import org.springframework.util.StringUtils;

public class LongestPalindromeSubstring {


    public static void main(String[] args){

        System.out.println(longestPalindrome("babad"));
    }
    public static String longestPalindrome(String s) {
       // int left=0;
        int maxLength=0;

        String answer="";
        String currString="";
        int currLength=0;

        for(int left=0;left<s.length();left++){
            for(int right=left;right<s.length();right++){
                currString=s.substring(left,right+1);
                currLength=currString.length();
                if(isPalindrome(currString)&&currLength>maxLength ){
                    maxLength=Math.max(maxLength,currLength);
                    answer=currString;
                }
            }
        }



        return answer;

    }


    public static boolean isPalindrome(String s){

        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        return s.length()!=0&&reverse.equals(s);
    }
}
