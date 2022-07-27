package com.mayank;

import java.util.Scanner;

public class Future_Investment_Value {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the present value: ");
        double p = in.nextDouble();
        System.out.print("Enter the interest rate: ");
        double i = in.nextDouble();
        System.out.print("Enter the time period in years: ");
        double n = in.nextDouble();

        double fv = p * Math.pow((1+i/100),n);
        System.out.println("Future Value is: "+fv);
    }
}
