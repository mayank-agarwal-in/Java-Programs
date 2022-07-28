package com.mayank;

import java.util.Arrays;

public class Shuffle_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }

    static int[] shuffle(int[] nums, int n) {

        int[] ans = new int[2*n];

        for(int i=0; i<n ; i++){
            ans[i*2] = nums[i];
        }

        for(int i=0; i<n ; i++){
            ans[2*i + 1] = nums[n+i];
        }

        return ans;

    }
}
