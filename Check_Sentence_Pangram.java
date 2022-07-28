package com.mayank;

import java.util.ArrayList;

public class Check_Sentence_Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        ArrayList<Character> list = new ArrayList<>();

        for(int i=0; i<sentence.length(); i++){
            if('a'<=sentence.charAt(i) && sentence.charAt(i)<='z'){
                if (!list.contains(sentence.charAt(i))){
                    list.add(sentence.charAt(i));
                }
            }
        }

        if (list.size() == 26)
            System.out.println(true);
        else System.out.println(false);

    }
}
