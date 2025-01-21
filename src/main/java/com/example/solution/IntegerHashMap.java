package com.example.solution;

import java.util.Arrays;

public class IntegerHashMap {

    int[] myHashmap;

    public IntegerHashMap(){
        myHashmap= new int[999999];
        Arrays.fill(myHashmap,-1);

    }

    public Object get(int key){
        return myHashmap[key];
    }

    public void put(int key,int value){
        myHashmap[key]=value;
    }

    public void remove(int key){
        myHashmap[key]=-1;
    }
}
