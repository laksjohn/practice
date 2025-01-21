package com.example.solution;

import java.util.Stack;

public class BalancedParanthesis {

    public static void main (String args[]){
        System.out.println(isBalanced("{{{}}}((()))"));

    }

    public static boolean isBalanced(String s){

        if(s.length()<=1){
            return false;
        }
        if(s.length()%2!=0){
            return false;
        }

        char[] chars = s.toCharArray();

        Stack<Character> charStack = new Stack<>();
        for(char c:chars){
            if((c=='(')){
                charStack.push(')');
            }else if(c=='{') {
                charStack.push('}');

            }else if(c=='[') {
                charStack.push(']');
            }else{
                if(!(charStack.isEmpty())&&!(c==charStack.pop())){
                   return false;
                }
            }

        }

        if (charStack.isEmpty())
        return true;
        else
            return false;
    }
}
