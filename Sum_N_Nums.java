package com.mayank;

import java.util.Scanner;

public class Sum_N_Nums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = in.nextInt();
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number "+(i+1)+": ");
            int x = in.nextInt();
            sum = sum + x;
        }

        System.out.println("Sum = "+sum);
    }
}
