package com.example.solution;

public class CapitalUsage {

    public boolean detectCapitalUse(String word) {


        if (word.toUpperCase().equals(word)) return true;
        if (word.toLowerCase().equals(word)) return true;

        char[] letterArray = word.toCharArray();

        if (Character.isUpperCase(letterArray[0])) {

            for (int i = 1; i < letterArray.length; i++) {
                if (Character.isUpperCase(letterArray[i])) return false;
            }

            return true;
        } else {


            return false;
        }
    }
}
