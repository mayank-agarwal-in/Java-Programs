package com.mayank;

public class Cells_Odd_Values_Matrix {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0,1}, {1,1}};
        System.out.println(oddCells(m,n,indices));
    }

    static int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        int count = 0;

        for(int k = 0; k< indices.length; k++){
            for(int i=0; i<n; i++){
                arr[indices[k][0]][i]++;
            }
            for(int j=0; j<m; j++){
                arr[j][indices[k][1]]++;
            }
        }
        //count odd nums
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] % 2 !=0 ){
                    count++;
                }
            }
        }
        return count;
    }
}
