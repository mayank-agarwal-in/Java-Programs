package com.mayank;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
//        Input currency in rupees and output in USD.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value in Rs. : ");
        int num = in.nextInt();

//        float usd  = 0.013f * num; or
        double usd  = 0.013 * num;

        System.out.println("Rs. "+ num + " = "+ usd + " USD");
    }
}
