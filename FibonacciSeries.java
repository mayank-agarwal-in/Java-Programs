package com.mayank;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter range: ");
        int n = in.nextInt();

        int a = 0,b = 1,temp;
        for (int i = 0; i < n; i++) {
            System.out.print(a + ", ");
            temp = b;
            b = a + b;
            a = temp;
        }
    }
}
