package com.example.solution;

public class WordDictionary {

    String[] array;
    int length;

    public WordDictionary() {

             array = new String[50000];
             length=0;
        }

        public void addWord(String word) {

            array[length++]=word;

        }

        public boolean search(String word) {

            for(String s:array){

                if(word!=null&s!=null) {
                    if (word.equals(s)) return true;
                    if(word.length()==s.length()) {
                        if (s.contains(word.replace(".", " ").trim())) return true;
                        if (word.replace(".", " ").trim().length() == 0) {
                            if (word.length() == s.length()) return true;
                        }
                    }
                }


            }

            return false;

        }

}
