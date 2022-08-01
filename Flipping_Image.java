package com.mayank;

import java.util.Arrays;

public class Flipping_Image {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};

        int[][] res = new int[image.length][image.length];

        //flip
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[i].length; j++){
                res[i][j] = image[i][image[i].length - j - 1];
            }
        }

        //invert
        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res[i].length; j++){
                if (res[i][j] == 0) res[i][j] = 1;
                else res[i][j] = 0;
            }
        }

        for(int i = 0; i < res.length; i++){
            System.out.print(Arrays.toString(res[i]));
        }

    }
}
