package com.example.ds;

import javax.management.AttributeList;
import java.util.*;

public class StringStudy {

    public int firstUniqueChar(String s) {

        char[] charArray = s.toCharArray();
        Map<Character, Integer> wordSet = new HashMap();

        for (char c : charArray) {

            if (!wordSet.containsKey(c))
                wordSet.put(c, 1);
            else
                wordSet.replace(c, wordSet.get(c), wordSet.get(c) + 1);

        }

        for (char c : charArray) {

            if (wordSet.get(c) == 1) return s.indexOf(c);

        }

        return -1;
    }


    public boolean canConstruct(String ransomNote, String magazine) {

        char[] magArray = magazine.toCharArray();
        char[] ranArray = ransomNote.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : magArray) {

            if (map.containsKey(c)) {

                map.replace(c, map.get(c), map.get(c) + 1);

            } else {
                map.put(c, 1);
            }
        }


        for (char c : ranArray) {

            if (!map.containsKey(c)) return false;
            else if (map.get(c) == 0) return false;
            else
                map.replace(c, map.get(c), map.get(c) - 1);


        }


        return true;
    }

    public boolean isAnagram(String s, String t) {



        List<Integer> sList = new ArrayList<>();
        List<Integer> tList = new ArrayList<>();

        for(int i:s.toCharArray()){
            sList.add(i);
        }

        for(int i:t.toCharArray()){
            tList.add(i);
        }

        Collections.sort(sList);
        Collections.sort(tList);

        if (sList.equals(tList)) return true;
        return false;

    }

}
