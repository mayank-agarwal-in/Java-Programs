package com.mayank;

import java.util.Scanner;

public class Average_N_Nums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float sum = 0;
        System.out.print("Enter "+n+" numbers: ");
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            sum = sum + x;
        }
        System.out.println("Average is "+(sum/n));
    }
}
