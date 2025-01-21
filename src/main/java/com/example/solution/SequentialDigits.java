package com.example.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SequentialDigits {

    public static void main(String args[]) {

        System.out.println(sequentialDigits(10, 1000));
    }

    public static List<Integer> sequentialDigits(int low, int high) {


        int[] array = new int[]{12, 23, 34, 45, 56, 67, 78, 89, 123, 234, 345, 456, 567, 678, 789, 1234, 2345, 3456, 4567, 5678, 6789, 12345, 23456, 34567, 45678, 56789, 123456, 234567, 345678, 456789, 1234567, 2345678, 3456789, 12345678, 2345678};

        List<Integer> result = new ArrayList<>();

        for (int i : array) {

            if (i >= low ||  i <= high) {
                result.add(i);
            }


        }

        Collections.sort(result);

        return result;


    }
}
