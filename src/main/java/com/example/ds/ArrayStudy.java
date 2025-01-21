package com.example.ds;

import java.util.*;

public class ArrayStudy {

    public static void main(String args[]) {

        System.out.println("Sum is " + intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}).toString());

    }

    public static boolean containsDuplicate(int[] nums) {

        int i = 0;
        Set integerSet = new HashSet();
        while (i < nums.length) {
            if (integerSet.contains(nums[i])) return true;
            integerSet.add(nums[i]);

            i++;

        }

        return false;

    }

    public static int maxSubArray(int[] nums) {

        int i = 0;
        int max = Integer.MIN_VALUE;
        int currSum = 0;

        while (i < nums.length) {
            currSum = currSum + nums[i];
            max = Math.max(max, currSum);

            if (currSum < 0) currSum = 0;
            i++;
        }

        return max;

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);

    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Map<Integer, Integer> integerCountMap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {

            integerCountMap.put(nums1[i], integerCountMap.getOrDefault(nums1[i], 0) + 1);

        }

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i < nums2.length; i++) {
            if (integerCountMap.containsKey(nums2[i]) && integerCountMap.get(nums2[i]) > 0) {
                integerArrayList.add(nums2[i]);
                integerCountMap.replace(nums2[i], integerCountMap.get(nums2[i]) - 1);

            }
        }

        int[] result = new int[integerArrayList.size()];
        int x = 0;
        for (int i : integerArrayList) {
            result[x] = i;
            x++;
        }

        return result;
    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int[][] result = new int[r][c];

        if (mat.length * mat[0].length != r * c) return mat;

        int row = 0, col = 0;
        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[0].length; j++) {
                result[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    row++;
                    col = 0;
                }
            }

        }


        return result;
    }

}
