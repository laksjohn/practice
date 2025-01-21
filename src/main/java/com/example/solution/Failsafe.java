package com.example.solution;

import java.util.ArrayList;
import java.util.Iterator;

public class Failsafe {


    public void testIteration() {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("lakshmi");

        Iterator<String> listIterator = myList.iterator();

        while(listIterator.hasNext()){
            String element = listIterator.next();
            System.out.println(element);
        }

    }

}
