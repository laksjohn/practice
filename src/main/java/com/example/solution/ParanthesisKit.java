package com.example.solution;

import java.util.Collections;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Stack;

public class ParanthesisKit {

    public static void main (String args[]){

        maxEfficiencyScore("()))((",new int[]{4,2,-3,-3},"(())");

    }

    public static int maxEfficiencyScore(String s,int[] scores,String kit ){

        int score=0;
        int maxScore=Integer.MIN_VALUE;

        PriorityQueue<Integer> openPq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> closePq = new PriorityQueue<>(Collections.reverseOrder());

        char[] kitChars = kit.toCharArray();

        for(int i=0;i<kit.length();i++){
            if(kit.charAt(i)=='('){
                openPq.add(scores[i]);

            }else{
                closePq.add(scores[i]);
            }
        }

        Stack<Character> characterStack = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'&&characterStack.isEmpty()){
                if(!openPq.isEmpty()){
                    score=score+openPq.poll();
                }
            }
            else if((s.charAt(i)==')') &&(characterStack.peek()=='(')){
                characterStack.pop();
            }else {
                characterStack.push(s.charAt(i));
            }
        }

        while(!characterStack.isEmpty()){
            if(characterStack.pop()=='('){
                score=score+closePq.poll();
            }
            if(characterStack.pop()==')'){
                score=score+openPq.poll();
            }

        }

        while(!openPq.isEmpty() && !closePq.isEmpty()){
            score=Math.max(score,openPq.poll()+closePq.poll()+score);
        }


        return score;
    }
}
