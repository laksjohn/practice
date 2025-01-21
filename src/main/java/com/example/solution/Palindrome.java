package com.example.solution;

public class Palindrome {

    public static void main (String args[]){

    }

    public static boolean isPalindrome(String s){

        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString().equals(sb.reverse().toString());

//        s.replace(" ","").replace("","").toLowerCase().toCharArray();
//
//        for(int i=0;i<s.length()/2;i++){
//            for(int j=s.length();j>=0;j--){
//                if char[i]!=char[j] return false;
//            }
//        }

    }
}
