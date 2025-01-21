package com.example.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RenameFile {

    public static void main(String[] args){

        System.out.println(rename("aba","ababa"));
    }

    public static int rename(String newName,String oldName){

        int answer=0;
        long tempAnswer=0L;


        List<String> result=new ArrayList<>();
        countSubsequences("",oldName,result,newName);

        tempAnswer = result.size();
        answer = (int) (tempAnswer % 1000000007L);

        return answer;
    }


    static void countSubsequences(String current, String remaining, List<String> result,String newName){

        if(remaining.isEmpty() && current.equals(newName)){
            result.add(current);
            return;
        }

        if(!remaining.isEmpty()) {
            char firstChar = remaining.charAt(0);
            countSubsequences(current + firstChar, remaining.substring(1), result, newName);
            countSubsequences(current, remaining.substring(1), result, newName);
        }

    }
}
