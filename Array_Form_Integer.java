package com.mayank;

import java.util.ArrayList;
import java.util.List;

public class Array_Form_Integer {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
//        int[] num = {1,2,0,0};
//        int k = 34;
        System.out.println(addToArrayForm(num,k));
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        int sum=0;
        List<Integer> list = new ArrayList<Integer>();

        for (int i = num.length-1; i >= 0; i--) {
            list.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;//0
        }
        while (k > 0) {
            list.add(0, k % 10);
            k /= 10;
        }
        return list;
    }
}
