package com.mayank;

import java.util.Scanner;

public class Sum_Digits_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int rem = n%10;
            sum += rem;
            n/=10;
        }

        System.out.println("The sum of digits is "+sum);
    }
}
