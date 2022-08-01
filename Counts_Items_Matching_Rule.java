package com.mayank;

import java.util.ArrayList;
import java.util.List;

public class Counts_Items_Matching_Rule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(List.of(new String[]{"phone", "blue", "pixel"}));
        items.add(List.of(new String[]{"computer","silver","lenovo"}));
        items.add(List.of(new String[]{"phone","gold","iphone"}));


        String ruleKey = "type";
        String ruleValue = "phone";
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(int i = 0; i < items.size(); i++){
            if(ruleKey.equals("type") && ruleValue.equals(items.get(i).get(0))) count++;
            if(ruleKey.equals("color") && ruleValue.equals(items.get(i).get(1))) count++;
            if(ruleKey.equals("name") && ruleValue.equals(items.get(i).get(2))) count++;
        }
        return count;
    }
}
