package com.example.blind;

public class NumberOfPalindromicSubStrings {
    public int countSubstrings(String s) {
       if(s==null)
           return 0;
       if(s.length()==1)
           return 1;

       int answer=0;

       for(int i=0;i<s.length();i++){
           int left=i;
           int right=i;
           while(left>=0&&right<s.length()&&(s.charAt(left)==s.charAt(right))){
               answer++;
               left--;
               right++;
           }
       }

        return 0;
    }
}
