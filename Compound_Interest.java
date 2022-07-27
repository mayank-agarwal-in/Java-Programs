package com.mayank;

import java.util.Scanner;

public class Compound_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        double p = in.nextDouble();

        System.out.print("Enter Rate: ");
        double r  = in.nextDouble();

        System.out.print("Enter Time: ");
        int t = in.nextInt();

        double ci = p * Math.pow((1 + r/100),t);
        System.out.println("Compound Interest is "+ci);
    }
}
