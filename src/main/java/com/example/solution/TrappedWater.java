package com.example.solution;

public class TrappedWater {

    public static void main (String args[]){
        int[] heights = new int[] {0,2,0,3,1,0,1,3,2,1};
        trap(heights);

    }

    public static int trap(int[] height) {

        if(height==null||height.length<=2){
            return 0;
        }
        int n=height.length;
        int result=0;

        for(int i=0;i<height.length;i++){
            int leftMax=height[i];
            int rightMax=height[i];

            for(int j=0;j<i;j++){
                leftMax=Math.max(leftMax,height[j]);
            }

            for(int j=i+1;j<height.length;j++){
                rightMax=Math.max(rightMax,height[j]);
            }

            result=result+Math.min(leftMax,rightMax)-height[i];

        }

return result;

    }

}
