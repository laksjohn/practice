package com.example.blind;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {

    public boolean isAnagram(String s, String t) {

        if(s==null&&t==null){
            return true;
        }

        s=s.toLowerCase().replaceAll("~[a-z0-9]","");
        if(s.length()!=t.length()){
            return false;
        }

        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);

        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);
       return Arrays.equals(sArray,tArray);

    }
}
