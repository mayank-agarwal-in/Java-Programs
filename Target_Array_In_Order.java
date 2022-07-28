package com.mayank;

import java.util.ArrayList;
import java.util.Arrays;

public class Target_Array_In_Order {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums ,index)));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
//        int[] target = {};
//        for(int i = 0; i < index.length; i++){ // 1
//            int[] array = insert(target, index[i], nums[i]);
//            target = array;
//            System.out.println(Arrays.toString(target));
//        }
//        return target;

        //best approach:
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        for (int i = 0; i < index.length; i++) {
            list.add(index[i],nums[i]);
        }
        int[] target = new int[nums.length];
        for (int i = 0; i < index.length; i++) {
            target[i] = list.get(i);
        }
        return target;
    }

//    static int[] insert(int[] a , int pos , int val){
//        int[] result = new int[a.length+1];
//        for(int i = 0; i < pos; i++){
//            result[i] = a[i];
//        }
//        result[pos] = val;
//        for(int i = pos+1; i <= a.length; i++){
//            result[i] = a[i-1];
//        }
//        return result;
//    }
}
