package com.example.solution;

import java.util.ArrayList;
import java.util.List;

public class MountainArray {

    public boolean validMountainArray(int[] arr) {

        if(arr.length<3) return false;
        List<Integer> diffList = new ArrayList<>();

        for(int i=0;i<arr.length-1;i++){
            int diff=arr[i+1]-arr[i];
            if(diff==0) return false;
            diffList.add(diff);

        }

        boolean down=false;
        boolean up=false;
        for(int i:diffList){

            if(i>0) up=true;
            if(i<0)  down=true;
            if(down&&i>0) return false;

        }

        if(up&&down)
        return true;
        else
            return false;

    }
}
