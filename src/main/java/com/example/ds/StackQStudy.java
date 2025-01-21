package com.example.ds;

import java.util.*;

public class StackQStudy {




    public boolean isValidParenthesis(String s) {
        String[] array = new String[10];
        array[0]="ashish";
        List<Integer> stringList = new ArrayList<>();
        stringList.add(1);

        List<String> linkList = new LinkedList<>();
        linkList.add("Lak");
        Stack<String> stringStack = new Stack<>();

        stringStack.push("john");

        Map<Integer,String> myMap = new HashMap<>();
        myMap.put(1,"mary");



        Stack<Character> characterStack = new Stack<>();
        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (c == ']' || c == '}' || c == ')') {
                if (characterStack.isEmpty()) return false;
                Character openChar = characterStack.peek();
                if (openChar == '{' && c == '}' || openChar == '[' && c == ']' || openChar == '(' && c == ')') {
                    characterStack.pop();
                    return true;
                } else return false;

            } else {
                characterStack.push(c);
            }
        }

        return characterStack.isEmpty();

    }
}
