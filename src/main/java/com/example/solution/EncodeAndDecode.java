package com.example.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecode {

    public static void main (String args[]){
        List<String> strs = Arrays.asList(new String[]{"neet","code","love","you"});

        String en= encode(strs);
        List<String> de = decode(en);

        System.out.println(strs.equals(de));


    }

    public static String encode(List<String> strs) {

        String output = String.format("%0"+3+"d",strs.size());
        //100 elements - 3 digit
        //each element can have a max length 200
        //LLLVALLLLVAL

        for (String str:strs) {

        output=output+String.format("%0"+3+"d",str.length())+str;

        }

        System.out.println(output);
        return output;
    }

    public static List<String> decode(String str) {

        int size = Integer.parseInt(str.substring(0,3));

        List<String> output = new ArrayList<>();
        int vliStart=3;
        int start=6;
        for(int i=0;i<size;i++){
            int length=Integer.valueOf(str.substring(vliStart,vliStart+3));
            String element=str.substring(start,start+length);
            vliStart=vliStart+length+3;
            start=start+length+3;
            output.add(element);
            System.out.println(element);

        }



        return output;
    }
}
