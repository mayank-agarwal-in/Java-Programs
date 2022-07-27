package com.mayank;

import java.util.Scanner;

public class SumNaturalNums_Method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println(sumNatural(n));
    }

    static int sumNatural(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }
}
