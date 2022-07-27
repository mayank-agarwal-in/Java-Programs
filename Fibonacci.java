package com.mayank;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
//        To calculate Fibonacci Series up to n numbers.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;

        if (n==0){
            System.out.println(a);
        }
        if (n==1){
            System.out.println(a+b);
        }

        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        System.out.println(b);
    }
}
