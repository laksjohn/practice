package com.example.solution;

public class StoneSquareGame {

    public static void main(String args[]) {

        System.out.println("Sum is " + winnerSquareGame(15));

    }
    public static boolean winnerSquareGame(int n) {

        int count=1;

        while (true) {
            int remainder= (int) Math.ceil(Math.sqrt(n) % 1);
            if (remainder== 0)
                break;
            else if(n>0){

                n=  (n-remainder);
            }else{
                break;
            }
            count++;
        }

        if(count%2==0) {
            return false;
        }else{
            return true;
        }


    }
}
