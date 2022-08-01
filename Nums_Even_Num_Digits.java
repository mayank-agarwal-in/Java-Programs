package com.mayank;

public class Nums_Even_Num_Digits {
    public static void main(String[] args) {
//        int[] nums = {12,345,2,6,7896};
        int[] nums = {437,315,322,431,686,264,442};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count1 = 0;
        for(int i=0; i< nums.length; i++){
            int count = 0;
            while(nums[i]!=0){
                nums[i]/=10;
                count++;
            }
            if(count % 2 == 0){
                count1++;
            }
        }
        return count1;
    }
}
